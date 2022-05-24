package test;

import one_one.ListNode;

import java.util.Stack;

public class demo25 {
    public static void main(String[] args) {
        ListNode node = new ListNode(1);
        node.next = new ListNode(2);
        node.next.next = new ListNode(3);
        node.next.next.next = new ListNode(4);
        node.next.next.next.next = new ListNode(5);
        reverseKGroup(node,2);
    }
    public static ListNode reverseKGroup(ListNode head, int k) {
        if (head == null) return null;
        int len = length(head);
        ListNode cur = new ListNode(0);
        ListNode pre = cur;
        Stack<ListNode> stack = new Stack<>();
        for (int i = 0; i < len / k; i++) {
            for (int j = 0; j < k; j++) {
                stack.push(head);
                head = head.next;
            }
            while (!stack.isEmpty()){
                cur.next = new ListNode(stack.pop().val);
                cur = cur.next;
            }
        }
        cur.next = head;
        return pre.next;
    }

    public static int length(ListNode head){
        int l = 0;
        while (head!=null){
            l++;
            head=head.next;
        }
        return l;
    }
}
