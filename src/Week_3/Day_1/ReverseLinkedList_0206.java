package Week_3.Day_1;


// https://leetcode.com/problems/reverse-linked-list/
// Rename class to "Solution" before submitting to LeetCode


class ReverseLinkedList_0206 {
    public ListNode reverseList(ListNode head) {
        if (head == null) return head;

        ListNode prev = null;
        ListNode present = head;
        ListNode next = present.next;

        while (present != null) {
            present.next = prev;
            prev = present;
            present = next;

            if (next != null) next = next.next;
        }

        return prev;
    }
}