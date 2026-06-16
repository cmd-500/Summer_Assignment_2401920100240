package Week_3.Day_2;


// https://leetcode.com/problems/palindrome-linked-list/
// Rename class to "Solution" before submitting to LeetCode


class PalindromeLinkedList_0234 {
    public boolean isPalindrome(ListNode head) {
        if (head == null || head.next == null) return true;

        ListNode slow = head;
        ListNode fast = head;

        // middle
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        // if odd length - skip middle
        if (fast != null) {
            slow = slow.next;
        }

        // reverse second half
        ListNode prev = null;
        while (slow != null) {
            ListNode next = slow.next;
            slow.next = prev;
            prev = slow;
            slow = next;
        }

        // compare halves
        while (prev != null) {
            if (head.val != prev.val) return false;
            head = head.next;
            prev = prev.next;
        }

        return true;
    }
}