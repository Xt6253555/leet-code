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
    public ListNode getIntersectionNodeV2(ListNode headA, ListNode headB) {
        // p1 指向 A 链表头结点，p2 指向 B 链表头结点
        ListNode p1 = headA, p2 = headB;
        while (p1 != p2) {
            // p1 ⾛⼀步，如果⾛到 A 链表末尾，转到 B 链表
            if (p1 == null) p1 = headB;
            else p1 = p1.next;
            // p2 ⾛⼀步，如果⾛到 B 链表末尾，转到 A 链表
            if (p2 == null) p2 = headA;
            else p2 = p2.next;
        }
        return p1;
    }
}
