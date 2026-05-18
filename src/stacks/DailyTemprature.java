package stacks;//Monotonic Decreasing Stack (Stack of Indices)

import java.util.Stack;//o(n) ,o(n)

public class DailyTemprature {
	public static int[] dailyTemperatures(int[] temperatures) {

        int n = temperatures.length;
        int[] ans = new int[n];
        Stack<Integer> st = new Stack<>();

        for (int i = 0; i < n; i++) {

            // Resolve previous colder days
            while (!st.isEmpty() && temperatures[i] > temperatures[st.peek()]) {
                int prevIndex = st.pop();
                ans[prevIndex] = i - prevIndex;
            }

            // Push current day index
            st.push(i);
        }

        return ans;
    }

    // MAIN METHOD FOR ECLIPSE
    public static void main(String[] args) {

        int[] temperatures = {73, 74, 75, 71, 69, 72, 76, 73};

        int[] result = dailyTemperatures(temperatures);

        System.out.print("Result: ");
        for (int x : result) {
            System.out.print(x + " ");
        }
    }
}
