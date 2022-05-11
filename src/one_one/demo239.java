package one_one;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Stack;

//滑动窗口最大值(单调递减栈)
public class demo239 {
    public static void main(String[] args) {
        int[] arr = {1,3,-1,-3,5,3,6,7};
        System.out.println(Arrays.toString(maxSlidingWindow(arr,3)));
    }
    //输入：nums = [1,3,-1,-3,5,3,6,7], k = 3
    //输出：[3,3,5,5,6,7]
    public static int[] maxSlidingWindow(int[] nums, int k) {
        if (nums == null || nums.length < 2) return nums;
        LinkedList<Integer> queue = new LinkedList<>();
        int[] res = new int[nums.length - k + 1];
        int l = 0, r = 0;
        while (r < nums.length) {
            while (!queue.isEmpty() && nums[r] > nums[queue.peekLast()]) {
                queue.pollLast();
            }
            queue.addLast(r);
            if (queue.peekFirst() <= r - k) {
                queue.poll();
            }
            if (r - l == k - 1) {
                res[l] = nums[queue.peekFirst()];
                l++;
            }
            r++;
        }
        return res;
    }
}
