package Week_4.Day_4;


// https://leetcode.com/problems/binary-tree-maximum-path-sum/
// Rename class to "Solution" before submitting to LeetCode


class BinaryTreeMaximumPathSum_0124 {
    int max = Integer.MIN_VALUE;

    public int maxPathSum(TreeNode root) {
        helper(root);
        return max;
    }

    private int helper(TreeNode node) {
        if (node == null) return 0;

        int left = Math.max(0, helper(node.left));
        int right = Math.max(0, helper(node.right));

        max = Math.max(max, left + right + node.val);

        return node.val + Math.max(left, right);
    }
}