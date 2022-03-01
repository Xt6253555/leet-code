package one_one;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Stack;

//下一个更大元素II
public class demo503 {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,3};
        int[] ints = nextGreaterElements(nums);
        System.out.println(Arrays.toString(ints));
    }
    //输入: nums = [1,2,3,4,3] 1 2 3 4 3
    //输出: [2,3,4,-1,4]
    public static int[] nextGreaterElements(int[] nums) {
        int[] arr = new int[nums.length*2];
        for (int i = 0; i < arr.length; i++) {
            if(i<nums.length){
                arr[i] = nums[i];
            }else{
                arr[i] = nums[i-nums.length];
            }
        }
        Stack<Integer> stack = new Stack<>();
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = nums.length - 1; i > 0; i--) {
            while (!stack.isEmpty()&&stack.peek()<=nums[i]){
                stack.pop();
            }
            map.put(nums[i],stack.isEmpty()?-1:stack.peek());
            stack.push(nums[i]);
        }
        int[] ans = new int[nums.length];
        return ans;
    }
}
