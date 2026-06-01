package Week_1.Day_1;

// https://leetcode.com/problems/two-sum/
// Rename class to "Solution" before submitting to LeetCode


class TwoSum_0001 {
    public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j}; // return indices
                }
            }
        }
        return new int[]{};
    }
}

