package graphs;

import java.util.ArrayList;

//DFS with Recursion Stack (pathVisited array)

public class detectCycleInDirectedGraphUsingDFS {//O(V + E),O(V)


	 // Function to detect cycle in directed graph
    public static boolean isCyclic(int V, ArrayList<ArrayList<Integer>> adj) {

        boolean[] visited = new boolean[V];
        boolean[] pathVisited = new boolean[V];

        // Handle disconnected graph
        for (int i = 0; i < V; i++) {
            if (!visited[i]) {
                if (dfsCheck(i, adj, visited, pathVisited)) {
                    return true;
                }
            }
        }
        return false;
    }

    // DFS helper function
    private static boolean dfsCheck(int node,
                                    ArrayList<ArrayList<Integer>> adj,
                                    boolean[] visited,
                                    boolean[] pathVisited) {

        visited[node] = true;
        pathVisited[node] = true;

        for (int neighbor : adj.get(node)) {

            // If node is unvisited → DFS
            if (!visited[neighbor]) {
                if (dfsCheck(neighbor, adj, visited, pathVisited)) {
                    return true;
                }
            }
            // If node is already in path → cycle
            else if (pathVisited[neighbor]) {
                return true;
            }
        }

        pathVisited[node] = false; // backtrack
        return false;
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

