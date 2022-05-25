package test;

import one_one.ListNode;

import java.util.ArrayList;

public class demo234 {
    public boolean isPalindrome(ListNode head) {
        ArrayList<Integer> list = new ArrayList<>();
        while (head!=null){
            list.add(head.val);
            head = head.next;
        }
        int l =0;
        int r = list.size()-1;
        while (l<r){
            if(!list.get(l).equals(list.get(r)))return false;
            l++;
            r--;
        }
        return true;
    }
}
