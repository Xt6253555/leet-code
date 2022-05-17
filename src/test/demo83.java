package test;

import one_one.ListNode;

public class demo83 {
    public ListNode deleteDuplicates(ListNode head) {
        if(head==null||head.next==null)return head;
        ListNode cur = new ListNode(0);
        cur.next = head;
        while (head != null ) {
            if (head.val == head.next.val) {
                head.next = head.next.next;
            } else {
                head = head.next;
            }
        }
        return cur.next;
    }
}
