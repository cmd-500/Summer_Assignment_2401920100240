package Week_3.Day_4;
import java.util.Stack;


// https://leetcode.com/problems/largest-rectangle-in-histogram/
// Rename class to "Solution" before submitting to LeetCode


class LargestRectangleInHistogram_0084 {
    public int largestRectangleArea(int[] heights) {

        Stack<Integer> stack = new Stack<>();
        int area = 0, height = 0, left = -1, right = 0;

        for (int i = 0; i < heights.length; i++) {
            right = i;

            while (!stack.isEmpty() && heights[i] < heights[stack.peek()]) {
                height = heights[stack.pop()];

                left = stack.isEmpty() ? -1 : stack.peek();
                int width = right - left - 1;

                area = Math.max(area, height * width);
            }

            stack.push(i);
        }

        right = heights.length;

        while (!stack.isEmpty()) {
            height = heights[stack.pop()];

            left = stack.isEmpty() ? -1 : stack.peek();
            int width = right - left - 1;

            area = Math.max(area, height * width);
        }

        return area;
    }
}