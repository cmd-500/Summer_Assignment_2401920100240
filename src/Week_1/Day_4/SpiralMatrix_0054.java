package Week_1.Day_4;
import java.util.*;


// https://leetcode.com/problems/spiral-matrix/
// Rename class to "Solution" before submitting to LeetCode


class SpiralMatrix_0054 {
    public List<Integer> spiralOrder(int[][] matrix) {

        int m = matrix.length;
        int n = matrix[0].length;

        List<Integer> storeSpiral = new ArrayList<>();

        int top = 0;
        int bottom = m - 1;
        int left = 0;
        int right = n - 1;

        while (top <= bottom && left <= right) {

            // top
            for (int j = left; j <= right; j++) {
                storeSpiral.add(matrix[top][j]);
            }
            top++;

            // right
            for (int i = top; i <= bottom; i++) {
                storeSpiral.add(matrix[i][right]);
            }
            right--;

            // bottom
            if (top <= bottom) {
                for (int j = right; j >= left; j--) {
                    storeSpiral.add(matrix[bottom][j]);
                }
            }
            bottom--;

            // left
            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    storeSpiral.add(matrix[i][left]);
                }
            }
            left++;

        }

        return storeSpiral;
    }
}
