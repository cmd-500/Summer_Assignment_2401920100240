package Week_4.Day_1;


// https://leetcode.com/problems/maximum-depth-of-binary-tree/
// Rename class to "Solution" before submitting to LeetCode


class MaximumDepthOfBinaryTree_0104 {
    public int maxDepth(TreeNode root) {
        if (root == null) return 0;

        return 1 + height(root);
    }

    public static int height(TreeNode root) {
        if (root == null || (root.left == null && root.right == null)) return 0;

        return 1 + Math.max(height(root.left), height(root.right));
    }
}