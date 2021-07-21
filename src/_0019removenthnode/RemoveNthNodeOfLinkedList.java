package _0019removenthnode;

import common.ListNode;

/**
 * Given the head of a linked list, remove the nth node from the end of the list and return its head.
 *
 */
public class RemoveNthNodeOfLinkedList {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode(0, head);
        int length = head.getLength();
        ListNode cur = dummy;
        for (int i = 1; i < length - n + 1; ++i) {
            cur = cur.next;
        }
        cur.next = cur.next.next;
        ListNode ans = dummy.next;
        return ans;
    }
}
