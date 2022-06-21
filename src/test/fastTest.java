package test;

import one_one.ListNode;

import java.util.Arrays;
import java.util.List;

public class fastTest {
    public static void main(String[] args) {
        int[] arr = {84, 83, 88, 87, 61, 50, 70, 60, 80, 99};
    }
    public ListNode mergeKLists(ListNode[] lists) {
        return merge(lists,0,lists.length-1);
    }

    private ListNode merge(ListNode[] lists, int l, int r) {
        if(l==r)return lists[l];
        int mid = (l+r)/2;
        ListNode left = merge(lists, l, mid);
        ListNode right = merge(lists, mid+1, r);
        return mergeNode(left,right);
    }

    private ListNode mergeNode(ListNode left, ListNode right) {
        ListNode pre = new ListNode(0);
        ListNode cur = pre;
        while (left!=null&&right!=null){
            if(left.val< right.val){
                cur.next = new ListNode(left.val);
                cur = cur.next;
                left = left.next;
            }else{
                cur.next = new ListNode(right.val);
                cur = cur.next;
                right = right.next;
            }
        }
        while (left!=null){
            cur.next = new ListNode(left.val);
            cur = cur.next;
            left = left.next;
        }
        while (right!=null){
            cur.next = new ListNode(right.val);
            cur = cur.next;
            right = right.next;
        }
        return pre.next;
    }

}
