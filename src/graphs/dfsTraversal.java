package graphs;//Depth First Search (DFS) using Recursion

import java.util.ArrayList;

public class dfsTraversal {// O(V + E),O(V)

	// DFS traversal function
	public static ArrayList<Integer> dfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj) {

		ArrayList<Integer> dfs = new ArrayList<>();
		boolean[] visited = new boolean[V];

		// Start DFS from node 0
		dfsHelper(0, adj, visited, dfs);

		return dfs;
	}

	// Recursive helper function
	private static void dfsHelper(int node, ArrayList<ArrayList<Integer>> adj, boolean[] visited,
			ArrayList<Integer> dfs) {

		visited[node] = true; // mark current node as visited
		dfs.add(node); // add node to result

		// visit all neighbors
		for (int neighbor : adj.get(node)) {
			if (!visited[neighbor]) {
				dfsHelper(neighbor, adj, visited, dfs);
			}
		}
	}

	// Main method for Eclipse execution
	public static void main(String[] args) {

		int V = 5;

		// Create adjacency list
		ArrayList<ArrayList<Integer>> adj = new ArrayList<>();

		for (int i = 0; i < V; i++) {
			adj.add(new ArrayList<>());
		}

		// Add edges
		adj.get(0).add(1);
		adj.get(0).add(2);
		adj.get(1).add(3);
		adj.get(2).add(4);

		// Call DFS
		ArrayList<Integer> result = dfsOfGraph(V, adj);

		// Print DFS traversal
		System.out.println("DFS Traversal:");
		for (int node : result) {
			System.out.print(node + " ");
		}
	}

}
