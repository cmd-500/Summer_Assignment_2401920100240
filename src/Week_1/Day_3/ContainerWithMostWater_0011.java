package Week_1.Day_3;


// https://leetcode.com/problems/container-with-most-water/
// Rename class to "Solution" before submitting to LeetCode


class ContainerWithMostWater_0011 {
    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int maxArea = 0;

        while (left < right) {
            int width = right - left;
            int minHeight = Math.min(height[left], height[right]);

            int area = width * minHeight;
            maxArea = Math.max(maxArea, area);

            if (height[left] < height[right]) left++;
            else right--;
        }

        return maxArea;
    }
}