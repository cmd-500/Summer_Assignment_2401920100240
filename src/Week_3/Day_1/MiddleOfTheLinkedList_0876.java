package Week_3.Day_1;


// https://leetcode.com/problems/middle-of-the-linked-list/
// Rename class to "Solution" before submitting to LeetCode


class MiddleOfTheLinkedList_0876 {
    public ListNode middleNode(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }
}