package graphs;//DFS with Parent Tracking
import java.util.ArrayList;
public class detectCycleInUndirectedGraphUsingDFS {//O(V + E),O(V)


	  // Function to detect cycle in an undirected graph
    public static boolean isCycle(int V, ArrayList<ArrayList<Integer>> adj) {

        boolean[] visited = new boolean[V];

        // Handle disconnected graph
        for (int i = 0; i < V; i++) {
            if (!visited[i]) {
                if (dfsCheck(i, -1, visited, adj)) {
                    return true;
                }
            }
        }
        return false;
    }

    // DFS helper function
    private static boolean dfsCheck(int node, int parent,
                                    boolean[] visited,
                                    ArrayList<ArrayList<Integer>> adj) {

        visited[node] = true;

        for (int neighbor : adj.get(node)) {

            // If neighbor is not visited, recurse
            if (!visited[neighbor]) {
                if (dfsCheck(neighbor, node, visited, adj)) {
                    return true;
                }
            }
            // If neighbor is visited and not parent => cycle
            else if (neighbor != parent) {
                return true;
            }
        }
        return false;
    }

    // Main method for Eclipse execution
    public static void main(String[] args) {

        int V = 5;

        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();

        for (int i = 0; i < V; i++) {
            adj.add(new ArrayList<>());
        }

        // Undirected edges
        adj.get(0).add(1);
        adj.get(1).add(0);

        adj.get(1).add(2);
        adj.get(2).add(1);

        adj.get(2).add(3);
        adj.get(3).add(2);

        adj.get(3).add(1); // creates cycle
        adj.get(1).add(3);

        // Cycle detection
        boolean hasCycle = isCycle(V, adj);

        System.out.println("Cycle present: " + hasCycle);
    }
}
