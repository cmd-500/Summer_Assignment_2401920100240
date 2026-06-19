package Week_3.Day_5;
import java.util.*;


// https://leetcode.com/problems/sliding-window-maximum/
// Rename class to "Solution" before submitting to LeetCode


class SlidingWindowMaximum_0239 {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int n = nums.length;

        int[] arr = new int[n - k + 1];
        Deque<Integer> q = new ArrayDeque<>();

        for (int i = 0; i < n; i++) {
            while (!q.isEmpty() && q.peek() < i - k + 1) q.poll();

            while (!q.isEmpty() && nums[q.peekLast()] < nums[i]) q.pollLast();

            q.offer(i);

            if (i >= k - 1) arr[i - k + 1] = nums[q.peek()];
        }

        return arr;
    }
}