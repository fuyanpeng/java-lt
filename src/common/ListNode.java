package common;

public class ListNode {
    public int val;
    public ListNode next;
    public ListNode() {}
    public ListNode(int val) { this.val = val; }
    public ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    public Integer getLength(){
        int length = 0;
        while (this.next != null) {
            length = length +1;
            this.next = this.next.next;
        }
        return length;

    }
}
