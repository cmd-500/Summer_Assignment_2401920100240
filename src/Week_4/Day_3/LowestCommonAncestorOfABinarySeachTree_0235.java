package Week_4.Day_3;


// https://leetcode.com/problems/lowest-common-ancestor-of-a-binary-search-tree/
// Rename class to "Solution" before submitting to LeetCode


class LowestCommonAncestorOfABinarySeachTree_0235 {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        while (root != null) {
            if (p.val < root.val && q.val < root.val) root = root.left;
            else if (p.val > root.val && q.val > root.val) root = root.right;
            else return root;
        }

        return null;
    }
}