package one_one;

import java.util.Arrays;

//下一个更大元素I
//输入：nums1 = [2,4], nums2 = [1,2,3,4].
//输出：[3,-1]
public class demo496 {
    public static void main(String[] args) {
        int[] nums1 = {2,4};
        int[] nums2 = {1,2,3,4};
        int[] arr = nextGreaterElement(nums1, nums2);
        System.out.println(Arrays.toString(arr));
    }
    public static int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] arr = new int[nums1.length];
        for (int i = 0; i < nums1.length; i++) {
            int ans = Integer.MAX_VALUE;
            for (int j = 0; j < nums2.length; j++) {
                if(nums1[i]==nums2[j]){
                    ans = j;
                }
                if(j>ans&&nums2[j]>nums1[i]){
                    arr[i] = nums2[j];
                    break;
                }
                if(j==nums2.length-1){
                    arr[i] = -1;
                }
            }
        }
        return arr;
    }
}
