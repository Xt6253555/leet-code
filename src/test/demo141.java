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
    public boolean hasCycleV2(ListNode head) {
        // 快慢指针初始化指向 head
        ListNode slow = head, fast = head;
        // 快指针⾛到末尾时停⽌
        while (fast != null && fast.next != null) {
            // 慢指针⾛⼀步，快指针⾛两步
            slow = slow.next;
            fast = fast.next.next;
            // 快慢指针相遇，说明含有环
            if (slow == fast) {
                return true;
            }
        }
        // 不包含环
        return false;
    }
}
