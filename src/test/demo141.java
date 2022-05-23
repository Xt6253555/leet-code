package test;

import one_one.ListNode;

import java.util.HashSet;

public class demo141 {
    public boolean hasCycle(ListNode head) {
        HashSet<ListNode> set = new HashSet<>();
        while (head!=null){
            if(set.contains(head))return true;
            set.add(head);
            head = head.next;
        }
        return false;
    }
}
