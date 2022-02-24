package one_one;
//合并k个升序列表
public class demo23 {
    public static ListNode mergeKLists(ListNode[] lists) {
        //归并排序
//        return mergeTwoLists(lists,0,lists.length-1);
        ListNode ans = null;
        for (ListNode list : lists) {
            ans = merge(ans, list);
        }
        return ans;
    }
    public static ListNode mergeTwoLists(ListNode[] lists,int l,int r) {
        if (l == r) return lists[l];
        int mid = (l + r)/2;
        ListNode left = mergeTwoLists(lists, l, mid);
        ListNode right = mergeTwoLists(lists, mid+1, r);
        return merge(left,right);
    }
    public static ListNode merge(ListNode list1 ,ListNode list2){
        ListNode pre = new ListNode(-1);
        ListNode cur = pre;
        while (list1!=null&&list2!=null){
            if(list1.val<list2.val){
                cur.next = new ListNode(list1.val);
                list1 = list1.next;
            }else{
                cur.next = new ListNode(list2.val);
                list2 = list2.next;
            }
            cur = cur.next;
        }
        while (list1!=null){
            cur.next = new ListNode(list1.val);
            list1 = list1.next;
            cur = cur.next;
        }
        while (list2!=null){
            cur.next = new ListNode(list2.val);
            list2 = list2.next;
            cur = cur.next;
        }
        return pre.next;
    }
}
