package one_one;

public class demo19 {
    //删除链表的倒数第N个结点
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int l = length(head);
        if(n==l)return head.next;
        ListNode pre = head;
        for (int i = 1; i < l-n; i++) {
            head = head.next;
        }
        head.next = head.next.next;
        return pre;
    }
    public static int length(ListNode head){
        int l =0;
        while (head!=null){
            l++;
            head =head.next;
        }
        return l;
    }
}
