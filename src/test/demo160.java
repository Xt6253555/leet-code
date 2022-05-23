package test;

import com.sun.org.apache.regexp.internal.RE;
import one_one.ListNode;

import java.util.HashSet;

public class demo160 {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        HashSet<ListNode> set = new HashSet<>();
        while (headA!=null){
            set.add(headA);
            headA = headA.next;
        }
        while (headB!=null){
            if(set.contains(headB)) return headB;
            headB = headB.next;
        }
        return null;
    }
}
