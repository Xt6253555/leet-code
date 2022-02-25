package one_one;

import java.util.HashSet;

//相交链表
public class demo160 {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        HashSet<ListNode> setA = new HashSet<>();
        while (headA!=null) {
            setA.add(headA);
            headA = headA.next;
        }
        while (headB!=null){
            if(setA.contains(headB)){
                return headB;
            }
            headB = headB.next;
        }
        return null;
    }
}
