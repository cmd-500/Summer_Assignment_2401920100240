package Week_4.Day_4;


// https://leetcode.com/problems/diameter-of-binary-tree/
// Rename class to "Solution" before submitting to LeetCode


class DiameterOfBinaryTree_0543 {
    int diameter = 0;

    public int diameterOfBinaryTree(TreeNode root) {
        height(root);
        return diameter;
    }

    private int height(TreeNode root) {
        if (root == null) return 0;

        int leftHeight = height(root.left);
        int rightHeight = height(root.right);

        diameter = Math.max(diameter, leftHeight + rightHeight);

        return 1 + Math.max(leftHeight, rightHeight);
    }
}