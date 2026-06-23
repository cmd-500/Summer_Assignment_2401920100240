package Week_4.Day_2;


// https://leetcode.com/problems/binary-tree-inorder-traversal/
// Rename class to "Solution" before submitting to LeetCode


class BinaryTreeInorderTraversal_0094 {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        traverse(root, result);

        return result;
    }

    private void traverse(TreeNode node, List<Integer> result) {
        if (node == null) return;

        traverse(node.left, result);
        result.add(node.val);
        traverse(node.right, result);
    }
}