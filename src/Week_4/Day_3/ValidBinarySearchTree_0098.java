package Week_4.Day_3;


// https://leetcode.com/problems/validate-binary-search-tree/
// Rename class to "Solution" before submitting to LeetCode


class ValidBinarySearchTree_0098 {
    public boolean isValidBST(TreeNode root) {
        return validate(root, null, null);
    }

    private boolean validate(TreeNode node, Integer min, Integer max) {
        if (node == null) return true;

        if ((min != null && node.val <= min) || (max != null && node.val >= max)) {
            return false;
        }

        return validate(node.left, min, node.val) && validate(node.right, node.val, max);
    }
}