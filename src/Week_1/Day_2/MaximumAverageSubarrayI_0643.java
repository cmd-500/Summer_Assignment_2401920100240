package Week_1.Day_2;


// https://leetcode.com/problems/maximum-average-subarray-i/
// Rename class to "Solution" before submitting to LeetCode


class MaximumAverageSubarrayI_0643 {
    public double findMaxAverage(int[] nums, int k) {
        int n = nums.length;

        int sum = 0;
        for (int i = 0; i < k; i++) sum += nums[i];

        double maxAvg = (double) sum / k; // suppose it is the maximum average;

        for (int right = k; right < n; right++) {
            sum = sum - nums[right - k] + nums[right];

            double avg = (double) sum / k;

            maxAvg = Math.max(maxAvg, avg);
        }

        return maxAvg;
    }
}