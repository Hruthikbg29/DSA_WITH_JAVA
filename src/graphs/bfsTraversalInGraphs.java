package graphs;//Breadth First Search (BFS) using Queue

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class bfsTraversalInGraphs {// O(V + E) ,O(E)

	// Method to perform BFS traversal
	public static ArrayList<Integer> bfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj) {

		ArrayList<Integer> bfs = new ArrayList<>(); // store BFS result
		boolean[] visited = new boolean[V]; // visited array
		Queue<Integer> queue = new LinkedList<>(); // queue for BFS

		// Start BFS from node 0
		queue.offer(0);
		visited[0] = true;

		while (!queue.isEmpty()) {

			int node = queue.poll(); // remove front element
			bfs.add(node); // add to result

			// Visit all neighbors
			for (int neighbor : adj.get(node)) {
				if (!visited[neighbor]) {
					visited[neighbor] = true;
					queue.offer(neighbor);
				}
			}
		}

		return bfs;
	}

	// Main method (Eclipse execution starts here)
	public static void main(String[] args) {

		int V = 5; // number of vertices

		// Create adjacency list
		ArrayList<ArrayList<Integer>> adj = new ArrayList<>();

		for (int i = 0; i < V; i++) {
			adj.add(new ArrayList<>());
		}

		// Adding edges
		adj.get(0).add(1);
		adj.get(0).add(2);
		adj.get(1).add(3);
		adj.get(2).add(4);

		// Call BFS
		ArrayList<Integer> result = bfsOfGraph(V, adj);

		// Print BFS Traversal
		System.out.println("BFS Traversal:");
		for (int node : result) {
			System.out.print(node + " ");
		}
	}
}
