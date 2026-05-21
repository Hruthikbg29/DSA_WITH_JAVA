package graphs;//BFS using Kahn’s Algorithm (Indegree Method)
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
public class topologicalSortingUsingKanhsAlgorithm {//O(V + E) , O(V)


	 // Function to perform topological sort using Kahn's Algorithm
    public static ArrayList<Integer> topoSort(int V, ArrayList<ArrayList<Integer>> adj) {

        int[] indegree = new int[V];

        // Step 1: Calculate indegree of each node
        for (int i = 0; i < V; i++) {
            for (int neighbor : adj.get(i)) {
                indegree[neighbor]++;
            }
        }

        // Step 2: Add nodes with indegree 0 to queue
        Queue<Integer> queue = new LinkedList<>();
        for (int i = 0; i < V; i++) {
            if (indegree[i] == 0) {
                queue.offer(i);
            }
        }

        ArrayList<Integer> topoOrder = new ArrayList<>();

        // Step 3: BFS
        while (!queue.isEmpty()) {
            int node = queue.poll();
            topoOrder.add(node);

            for (int neighbor : adj.get(node)) {
                indegree[neighbor]--;

                if (indegree[neighbor] == 0) {
                    queue.offer(neighbor);
                }
            }
        }

        return topoOrder;
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

        System.out.println("Topological Sort using Kahn's Algorithm:");
        for (int node : result) {
            System.out.print(node + " ");
        }
    }
}
