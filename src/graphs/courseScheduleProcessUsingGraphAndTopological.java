package graphs;//Topological Sorting using BFS (Kahn’s Algorithm)
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue; //O(V + E),O(V + E)both same


public class courseScheduleProcessUsingGraphAndTopological {
	// Function to check if all courses can be completed
    public static boolean canFinish(int numCourses, int[][] prerequisites) {

        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        int[] indegree = new int[numCourses];

        // Initialize adjacency list
        for (int i = 0; i < numCourses; i++) {
            adj.add(new ArrayList<>());
        }

        // Build graph and indegree array
        for (int[] pre : prerequisites) {
            int course = pre[0];
            int prereq = pre[1];

            adj.get(prereq).add(course); // prereq → course
            indegree[course]++;
        }

        Queue<Integer> queue = new LinkedList<>();

        // Add all courses with indegree 0
        for (int i = 0; i < numCourses; i++) {
            if (indegree[i] == 0) {
                queue.offer(i);
            }
        }

        int completed = 0;

        // BFS (Topological sort)
        while (!queue.isEmpty()) {
            int curr = queue.poll();
            completed++;

            for (int next : adj.get(curr)) {
                indegree[next]--;

                if (indegree[next] == 0) {
                    queue.offer(next);
                }
            }
        }

        return completed == numCourses;
    }

    // Main method for Eclipse execution
    public static void main(String[] args) {

        int numCourses = 4;
        int[][] prerequisites = {
            {1, 0},
            {2, 1},
            {3, 2}
        };

        boolean result = canFinish(numCourses, prerequisites);
        System.out.println("Can finish all courses: " + result);
    }
}
