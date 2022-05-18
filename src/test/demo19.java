package test;

import one_one.ListNode;

public class demo19 {
    public static void main(String[] args) {
        ListNode node = new ListNode(1);
        node.next = new ListNode(2);
        node.next.next  = new ListNode(3);
        node.next.next.next  = new ListNode(4);
        node.next.next.next.next  = new ListNode(5);
        ListNode listNode = removeNthFromEnd(node,2);
    }
    public static ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode p1 = head;
        ListNode cur = new ListNode(0);
        cur.next = head;
        ListNode p2 = cur;
        while (n!=0){
            p1 = p1.next;
            n--;
        }
        while (p1!=null){
            p1 = p1.next;
            p2 = p2.next;
        }
        p2.next = p2.next.next;
        return cur.next;
    }
}
