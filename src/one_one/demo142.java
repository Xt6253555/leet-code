package one_one;

import java.util.HashSet;

//环形链表2
public class demo142 {
    public ListNode detectCycle(ListNode head) {
        HashSet<ListNode> set = new HashSet<>();
        while (head!=null){
            if(set.contains(head.next)){
                return head.next;
            }
            set.add(head);
            head = head.next;
        }
        return null;
    }
}
