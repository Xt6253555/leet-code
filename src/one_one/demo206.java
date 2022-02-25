package one_one;

import java.util.Stack;

//反转链表
public class demo206 {
    public static ListNode reverseList(ListNode head) {
        Stack<ListNode> stack = new Stack<>();
        ListNode pre = new ListNode(0);
        ListNode cur = pre;
        while (head!=null){
            stack.push(head);
            head = head.next;
        }
        while (!stack.isEmpty()){
            pre.next = new ListNode(stack.pop().val);
            pre = pre.next;
        }
        return cur.next;
    }
}
