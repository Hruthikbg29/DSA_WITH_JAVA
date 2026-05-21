package graphs;//Dynamic Programming / Edge Relaxation
import java.util.Arrays;
public class bellManFordAlgorithmSingleSourceShortesPath {//O(V × E),O(V)


	    // Edge structure
	    static class Edge {
	        int u, v, wt;

	        Edge(int u, int v, int wt) {
	            this.u = u;
	            this.v = v;
	            this.wt = wt;
	        }
	    }

	    // Bellman-Ford function
	    public static void bellmanFord(int V, Edge[] edges, int S) {

	        int[] dist = new int[V];
	        Arrays.fill(dist, Integer.MAX_VALUE);
	        dist[S] = 0;

	        // Step 1: Relax all edges V-1 times
	        for (int i = 1; i <= V - 1; i++) {
	            for (Edge e : edges) {
	                if (dist[e.u] != Integer.MAX_VALUE &&
	                        dist[e.u] + e.wt < dist[e.v]) {
	                    dist[e.v] = dist[e.u] + e.wt;
	                }
	            }
	        }

	        // Step 2: Check for negative cycle
	        for (Edge e : edges) {
	            if (dist[e.u] != Integer.MAX_VALUE &&
	                    dist[e.u] + e.wt < dist[e.v]) {
	                System.out.println("Negative weight cycle detected");
	                return;
	            }
	        }

	        // Print distances
	        System.out.println("Shortest distances from source " + S + ":");
	        for (int i = 0; i < V; i++) {
	            System.out.println(i + " -> " + dist[i]);
	        }
	    }

	    // Main method for Eclipse execution
	    public static void main(String[] args) {

	        int V = 5;
	        int S = 0;

	        Edge[] edges = {
	            new Edge(0, 1, -1),
	            new Edge(0, 2, 4),
	            new Edge(1, 2, 3),
	            new Edge(1, 3, 2),
	            new Edge(1, 4, 2),
	            new Edge(3, 2, 5),
	            new Edge(3, 1, 1),
	            new Edge(4, 3, -3)
	        };

	        bellmanFord(V, edges, S);
	    }

}
