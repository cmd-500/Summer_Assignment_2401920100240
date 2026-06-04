package Week_1.Day_4;


// https://leetcode.com/problems/reshape-the-matrix/
// Rename class to "Solution" before submitting to LeetCode


class ReshapeTheMatrix_0566 {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int m = mat.length;
        int n = mat[0].length;

        if (m * n != r * c) return mat;

        int[] mat1D = new int[m * n]; // to store 2D matrix into 1D

        int idx = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                mat1D[idx] = mat[i][j];
                idx++;
            }
        }

        idx = 0;
        int[][] result = new int[r][c];
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                result[i][j] = mat1D[idx];
                idx++;
            }
        }

        return result;
    }
}
