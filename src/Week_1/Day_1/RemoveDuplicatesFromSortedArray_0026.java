package Week_1.Day_1;

// https://leetcode.com/problems/remove-duplicates-from-sorted-array/
// Rename class to "Solution" before submitting to LeetCode


class RemoveDuplicatesFromSortedArray_0026 {
    public int removeDuplicates(int[] nums) {
        int left = 0;

        for (int right = 1; right < nums.length; right++) {
            if (nums[right] != nums[left]) {
                left++;
                nums[left] = nums[right];
            }
            // left++;
            // nums[left] = nums[right];
        }

        return left + 1;

    }
}