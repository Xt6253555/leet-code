package test;

import one_one.ListNode;

import java.util.Stack;

public class demo92 {
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if (head==null||head.next==null)return head;
        ListNode cur = new ListNode(0);
        ListNode pre = cur;
        Stack<ListNode> stack = new Stack<>();
        for (int i = 0; i < left; i++) {
            cur.next = new ListNode(head.val);
            cur = cur.next;
            head = head.next;
        }
        for (int i = left; i <= right; i++) {
            stack.push(head);
            head = head.next;
        }
        while (!stack.isEmpty()){
            cur.next = new ListNode(stack.pop().val);
            cur = cur.next;
        }
        cur.next = head;
        return pre.next;
    }
}
