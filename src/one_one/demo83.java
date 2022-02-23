package one_one;

import code.HotelMinPriceProxy;

//删除排序链表中的重复元素
public class demo83 {
    public static ListNode deleteDuplicates(ListNode head) {
        if(head==null||head.next==null)return head;
        ListNode cur = new ListNode(0);
        cur.next = head;
        while(head.next!=null){
            if(head.val==head.next.val){
                head.next = head.next.next;
            }else{
                head = head.next;
            }
        }
        return cur.next;
    }
}
