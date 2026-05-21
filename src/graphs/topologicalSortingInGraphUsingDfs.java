package graphs;//DFS + Stack (Post-Order Traversal)
import java.util.ArrayList;
import java.util.Stack;
public class topologicalSortingInGraphUsingDfs {//O(V + E) ,O(V)
    // Function to perform topological sort
    public static ArrayList<Integer> topoSort(int V, ArrayList<ArrayList<Integer>> adj) {

        boolean[] visited = new boolean[V];
        Stack<Integer> stack = new Stack<>();

        // Perform DFS for each component
        for (int i = 0; i < V; i++) {
            if (!visited[i]) {
                dfs(i, visited, adj, stack);
            }
        }

        ArrayList<Integer> topoOrder = new ArrayList<>();

        // Pop elements from stack
        while (!stack.isEmpty()) {
            topoOrder.add(stack.pop());
        }

        return topoOrder;
    }

    // DFS helper
    private static void dfs(int node,
                            boolean[] visited,
                            ArrayList<ArrayList<Integer>> adj,
                            Stack<Integer> stack) {

        visited[node] = true;

        // Visit all neighbors
        for (int neighbor : adj.get(node)) {
            if (!visited[neighbor]) {
                dfs(neighbor, visited, adj, stack);
            }
        }

        // Push node after all neighbors are processed
        stack.push(node);
    }

    // Main method for Eclipse execution
    public static void main(String[] args) {

        int V = 6;

        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();

        for (int i = 0; i < V; i++) {
            adj.add(new ArrayList<>());
        }

        // Directed edges
        adj.get(5).add(2);
        adj.get(5).add(0);
        adj.get(4).add(0);
        adj.get(4).add(1);
        adj.get(2).add(3);
        adj.get(3).add(1);

        ArrayList<Integer> result = topoSort(V, adj);

        System.out.println("Topological Sort (DFS):");
        for (int node : result) {
            System.out.print(node + " ");
        }
    }
}
