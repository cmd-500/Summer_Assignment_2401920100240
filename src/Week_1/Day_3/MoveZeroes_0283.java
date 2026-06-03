package Week_1.Day_3;


// https://leetcode.com/problems/move-zeroes/
// Rename class to "Solution" before submitting to LeetCode


class MoveZeroes_0283 {
    public void moveZeroes(int[] nums) {
        int insertPos = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                int temp = nums[i];
                nums[i] = nums[insertPos];
                nums[insertPos] = temp;

                insertPos++;
            }
        }

    }
}