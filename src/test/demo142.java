package test;

import one_one.ListNode;

import java.util.HashSet;

public class demo142 {
    public ListNode detectCycle(ListNode head) {
        HashSet<ListNode> set = new HashSet<>();
        while (head!=null){
            if(set.contains(head)){
                return head.next;
            }
            set.add(head);
            head = head.next;
        }
        return null;
    }
}
