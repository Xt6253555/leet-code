package test;

import one_one.ListNode;

import java.util.List;

public class demo23 {
    public ListNode mergeKLists(ListNode[] lists) {
        return merge(lists,0,lists.length-1);
    }
    public ListNode merge(ListNode[] lists, int l, int r) {
        if(l==r)return lists[l];
        int mid = (l+r)/2;
        ListNode left = merge(lists, l, mid);
        ListNode right = merge(lists, mid+1, r);
        return mergeLists(left,right);
    }
    public ListNode mergeLists(ListNode list1, ListNode list2){
        // 虚拟头结点
        ListNode dummy = new ListNode(-1), p = dummy;
        ListNode p1 = list1, p2 = list2;
        while (p1 != null && p2 != null) {
            // ⽐较 p1 和 p2 两个指针
            // 将值较⼩的的节点接到 p 指针
            if (p1.val > p2.val) {
                p.next = p2;
                p2 = p2.next;
            } else {
                p.next = p1;
                p1 = p1.next;
            }
            // p 指针不断前进
            p = p.next;
        }
        if (p1 != null) {
            p.next = p1;
        }
        if (p2 != null) {
            p.next = p2;
        }
        return dummy.next;
    }
}
