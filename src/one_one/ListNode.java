package one_one;

public class ListNode {
    public int val;
    public ListNode next;
    public ListNode() {}
    public ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    public static void list(ListNode head){
        while (head!=null){
            System.out.println(head.val);
            head = head.next;
        }
    }
    public static int length(ListNode head){
        int l = 0;
        while (head!=null){
            l++;
            head = head.next;
        }
        return l;
    }
}
