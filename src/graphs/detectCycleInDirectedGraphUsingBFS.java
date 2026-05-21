package graphs;//BFS using Kahn’s Algorithm (Indegree Method)
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class detectCycleInDirectedGraphUsingBFS {//O(V + E),O(V)


	// Function to detect cycle using BFS (Kahn's Algorithm)
    public static boolean isCyclic(int V, ArrayList<ArrayList<Integer>> adj) {

        int[] indegree = new int[V];

        // Calculate indegree of each node
        for (int i = 0; i < V; i++) {
            for (int neighbor : adj.get(i)) {
                indegree[neighbor]++;
            }
        }

        Queue<Integer> queue = new LinkedList<>();

        // Add nodes with indegree 0
        for (int i = 0; i < V; i++) {
            if (indegree[i] == 0) {
                queue.offer(i);
            }
        }

        int count = 0; // count of processed nodes

        // BFS
        while (!queue.isEmpty()) {

            int node = queue.poll();
            count++;

            for (int neighbor : adj.get(node)) {
                indegree[neighbor]--;

                if (indegree[neighbor] == 0) {
                    queue.offer(neighbor);
                }
            }
        }

        // If count != V → cycle exists
        return count != V;
    }

    // Main method for Eclipse execution
    public static void main(String[] args) {

        int V = 4;

        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();

        for (int i = 0; i < V; i++) {
            adj.add(new ArrayList<>());
        }

        // Directed edges
        adj.get(0).add(1);
        adj.get(1).add(2);
        adj.get(2).add(3);
        adj.get(3).add(1); // creates cycle

        boolean hasCycle = isCyclic(V, adj);
        System.out.println("Cycle present: " + hasCycle);
    }
}
