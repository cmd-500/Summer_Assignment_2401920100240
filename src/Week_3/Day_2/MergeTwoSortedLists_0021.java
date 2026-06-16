package Week_3.Day_2;


// https://leetcode.com/problems/merge-two-sorted-lists/
// Rename class to "Solution" before submitting to LeetCode


class MergeTwoSortedLists_0021 {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {

        ListNode dummyHead = new ListNode();
        ListNode tail = dummyHead;

        while (list1 != null && list2 != null) {
            if (list1.val < list2.val) {
                tail.next = list1;
                list1 = list1.next;
                tail = tail.next;
            } else {
                tail.next = list2;
                list2 = list2.next;
                tail = tail.next;
            }
        }

        tail.next = (list1 != null) ? list1 : list2;

        return dummyHead.next;
    }
}