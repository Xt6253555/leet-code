package test;

import one_one.ListNode;

public class demo2 {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode cur = new ListNode(0);
        ListNode pre  = cur;
        int flag = 0;
        while (l1!=null||l2!=null){
            int a = l1!=null?l1.val:0;
            int b = l2!=null?l2.val:0;
            int sum = a+b+flag;
            flag = sum/10;
            cur.next = new ListNode(sum%10);
            cur = cur.next;
            if(l1!=null)l1 = l1.next;
            if(l2!=null)l2 = l2.next;
        }
        if(flag>0){
            cur.next = new ListNode(flag);
        }
        return pre.next;
    }
}
