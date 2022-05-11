package test;

import java.util.LinkedList;
import java.util.Queue;

public class demo239 {
    public int[] maxSlidingWindow(int[] nums, int k) {
        if(nums.length<2)return nums;
        LinkedList<Integer> queue = new LinkedList<>();
        int[] res = new int[nums.length-k+1];
        int l =0;
        int r =0;
        while (r<nums.length){
            while (!queue.isEmpty()&&nums[r]>nums[queue.peekLast()]){
                queue.pollLast();
            }
            queue.add(r);
            if(queue.peekFirst()<r-l){
                queue.pollLast();
            }
            if(r-l==k-1){
                res[l]=nums[queue.peekFirst()];
                l++;
            }
            r++;
        }
        return res;
    }
}
