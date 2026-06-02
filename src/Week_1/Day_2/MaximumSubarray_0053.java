package Week_1.Day_2;


// https://leetcode.com/problems/maximum-subarray/
// Rename class to "Solution" before submitting to LeetCode


class MaximumSubarray_0053 {
    public int maxSubArray(int[] nums) {
        int currentSum = nums[0];
        int maxSum = nums[0];

        for (int i = 1; i < nums.length; i++) {
            currentSum = Math.max(nums[i], currentSum + nums[i]);
            maxSum = Math.max(maxSum, currentSum);
        }

        return maxSum;
    }
}
