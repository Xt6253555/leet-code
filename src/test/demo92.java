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
    public ListNode reverseBetweenV2(ListNode head, int m, int n) {
        // base case
        if (m == 1) {
            return reverseN(head, n);
        }
        // 前进到反转的起点触发 base case
        head.next = reverseBetweenV2(head.next, m - 1, n - 1);
        return head;
    }
    ListNode successor = null; // 后驱节点
    // 反转以 head 为起点的 n 个节点，返回新的头结点
    ListNode reverseN(ListNode head, int n) {
        if (n == 1) {
            // 记录第 n + 1 个节点
            successor = head.next;
            return head;
        }
        // 以 head.next 为起点，需要反转前 n - 1 个节点
        ListNode last = reverseN(head.next, n - 1);
        head.next.next = head;
        // 让反转之后的 head 节点和后⾯的节点连起来
        head.next = successor;
        return last;
    }
}
