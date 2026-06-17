package Week_3.Day_3;
import java.util.*;


// https://leetcode.com/problems/next-greater-element-i/
// Rename class to "Solution" before submitting to LeetCode


class NextGreaterElementI_0496 {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {

        Stack<Integer> stack = new Stack<>();
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int num : nums2) {
            while (!stack.isEmpty() && num > stack.peek()) {
                map.put(stack.pop(), num);
            }

            stack.push(num);
        }

        while (!stack.isEmpty()) map.put(stack.pop(), -1);

        int[] ans = new int[nums1.length];
        for (int i = 0; i < nums1.length; i++) ans[i] = map.get(nums1[i]);

        return ans;
    }
}