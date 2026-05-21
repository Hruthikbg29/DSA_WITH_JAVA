package graphs;//BFS with Parent Tracking
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
public class detectCycleInUndirectedFGraphUsingBFS {//O(V + E),O(V)


	 // Helper class to store node and its parent
    static class Pair {
        int node;
        int parent;

        Pair(int node, int parent) {
            this.node = node;
            this.parent = parent;
        }
    }

    // Function to detect cycle using BFS
    public static boolean isCycle(int V, ArrayList<ArrayList<Integer>> adj) {

        boolean[] visited = new boolean[V];

        // Check for every component
        for (int i = 0; i < V; i++) {
            if (!visited[i]) {
                if (bfsCheck(i, visited, adj)) {
                    return true;
                }
            }
        }
        return false;
    }

    // BFS function
    private static boolean bfsCheck(int start,
                                    boolean[] visited,
                                    ArrayList<ArrayList<Integer>> adj) {

        Queue<Pair> queue = new LinkedList<>();
        queue.offer(new Pair(start, -1));
        visited[start] = true;

        while (!queue.isEmpty()) {

            Pair current = queue.poll();
            int node = current.node;
            int parent = current.parent;

            for (int neighbor : adj.get(node)) {

                // If neighbor not visited → visit it
                if (!visited[neighbor]) {
                    visited[neighbor] = true;
                    queue.offer(new Pair(neighbor, node));
                }
                // If visited and not parent → cycle
                else if (neighbor != parent) {
                    return true;
                }
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

        adj.get(3).add(1); // cycle edge
        adj.get(1).add(3);

        // Detect cycle
        boolean hasCycle = isCycle(V, adj);
        System.out.println("Cycle present: " + hasCycle);
    }
}
