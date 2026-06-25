package Week_4.Day_4;


// https://leetcode.com/problems/path-sum/
// Rename class to "Solution" before submitting to LeetCode


class PathSum_0112 {
    public boolean hasPathSum(TreeNode root, int targetSum) {
        return helper(root, 0, targetSum);
    }

    public boolean helper(TreeNode root, int currentSum, int targetSum) {
        if (root == null) return false;

        currentSum += root.val;

        if (root.left == null && root.right == null) return currentSum == targetSum;

        return helper(root.left, currentSum, targetSum) || helper(root.right, currentSum, targetSum);
    }
}