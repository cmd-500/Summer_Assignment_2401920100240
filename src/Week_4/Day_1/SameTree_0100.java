package Week_4.Day_1;


// https://leetcode.com/problems/same-tree/
// Rename class to "Solution" before submitting to LeetCode


class SameTree_0100 {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null && q == null) return true;
        if (p == null || q == null) return false;

        if (p.val != q.val) return false;

        return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
    }
}