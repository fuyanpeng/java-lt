package _0021mergesortedlinknode;

import common.ListNode;

public class MergeTwoSortedLinkNode {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode newhead = new ListNode(-1);
        ListNode rs = newhead;
        while (l1 != null && l2 != null) {
            if (l1.val <= l2.val) {
                rs.next = l1;
                l1 = l1.next;
            } else {
                rs.next = l2;
                l2 = l2.next;
            }
            rs = rs.next;
        }
        if (l1 == null) {
            rs.next = l2;
        }
        if (l2 == null) {
            rs.next = l1;
        }
        return newhead.next;
    }
}
