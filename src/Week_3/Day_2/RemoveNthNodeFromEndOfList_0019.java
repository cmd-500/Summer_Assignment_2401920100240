package Week_3.Day_2;


// https://leetcode.com/problems/remove-nth-node-from-end-of-list/
// Rename class to "Solution" before submitting to LeetCode


class RemoveNthNodeFromEndOfList_0019 {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if (head == null && head.next == null) return null;

        ListNode slow = head;
        ListNode fast = head;

        for (int i = 0; i < n; i++) {
            fast = fast.next;
        }

        if (fast == null) return head.next;

        while (fast.next != null) {
            slow = slow.next;
            fast = fast.next;
        }

        slow.next = slow.next.next;

        return head;
    }
}