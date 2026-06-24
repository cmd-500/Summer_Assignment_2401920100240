package Week_4.Day_3;


// https://leetcode.com/problems/search-in-a-binary-search-tree/
// Rename class to "Solution" before submitting to LeetCode


class SearchInABinarySearchTree_0700 {
    public TreeNode searchBST(TreeNode root, int val) {
        while (root != null) {
            if (root.val > val) root = root.left;
            else if (root.val < val) root = root.right;
            else return root;
        }

        return null;
    }
}