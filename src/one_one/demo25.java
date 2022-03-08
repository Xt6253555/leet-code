package one_one;

import java.util.Stack;

import static one_one.ListNode.list;

// K 个一组翻转链表
public class demo25 {
    public static void main(String[] args) {
        ListNode l1 = new ListNode(1);
        l1.next = new ListNode(2);
        l1.next.next = new ListNode(3);
        l1.next.next.next = new ListNode(4);
        l1.next.next.next.next = new ListNode(5);
        ListNode node = reverseKGroup(l1, 3);
        list(node);
    }
    public static ListNode reverseKGroup(ListNode head, int k) {
        if(head==null||head.next==null)return head;
        int l = length(head)/k;
        Stack<Integer> stack = new Stack<>();
        ListNode cur = new ListNode(0);
        ListNode pre = cur;
        for (int i = 0; i < l; i++) {
            for (int j = 0; j < k; j++) {
                stack.push(head.val);
                head = head.next;
            }
            while (!stack.isEmpty()){
                pre.next = new ListNode(stack.pop());
                pre = pre.next;
            }
        }
        pre.next = head;
        return cur.next;
    }
    public static int length(ListNode head){
        int l = 0;
        while (head!=null){
            head = head.next;
            l++;
        }
        return l;
    }
}
