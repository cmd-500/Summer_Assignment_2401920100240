package Week_3.Day_1;


// https://leetcode.com/problems/linked-list-cycle/
// Rename class to "Solution" before submitting to LeetCode


public class LinkedListCycle_0141 {
    public boolean hasCycle(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;

        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;

            if (fast == slow) return true;
        }

        return false;
    }
}