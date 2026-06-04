package Week_1.Day_4;


// https://leetcode.com/problems/matrix-diagonal-sum/
// Rename class to "Solution" before submitting to LeetCode


class MatrixDiagonalSum_1572 {
    public int diagonalSum(int[][] mat) {
        int n = mat.length;

        int sum = 0;
        for (int i = 0; i < n; i++) {
            if (i == n - 1 - i) sum += mat[i][i]; // cause n can be odd!
            else sum += mat[i][i] + mat[i][n-1-i];
        }

        return sum;
    }
}
