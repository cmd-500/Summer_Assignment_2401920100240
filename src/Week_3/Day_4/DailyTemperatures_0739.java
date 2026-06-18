package Week_3.Day_4;
import java.util.Stack;


// https://leetcode.com/problems/daily-temperatures/
// Rename class to "Solution" before submitting to LeetCode


class DailyTemperatures_0739 {
    public int[] dailyTemperatures(int[] temperatures) {
        int n = temperatures.length;

        int[] ans = new int[n];
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < n; i++) {
            while (!stack.isEmpty() && temperatures[i] > temperatures[stack.peek()]) {
                int prevIndex = stack.pop();

                ans[prevIndex] = i - prevIndex;
            }

            stack.push(i);
        }

        return ans;
    }
}