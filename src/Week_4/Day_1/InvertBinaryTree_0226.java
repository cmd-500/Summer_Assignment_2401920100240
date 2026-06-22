package Week_4.Day_1;


// https://leetcode.com/problems/invert-binary-tree/
// Rename class to "Solution" before submitting to LeetCode


class InvertBinaryTree_0226 {
    public TreeNode invertTree(TreeNode root) {
        if (root == null) return root;

        TreeNode l = root.left;
        TreeNode r = root.right;

        root.left = invertTree(r);
        root.right = invertTree(l);

        return root;
    }
}