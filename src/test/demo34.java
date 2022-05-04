package test;

import java.util.Arrays;

public class demo34 {
    public static void main(String[] args) {
        demo34 demo34 = new demo34();
        int[]arr = {5,7,8,8,10};
        int[] ints = demo34.searchRange(arr, 8);
        System.out.println(Arrays.toString(ints));
    }
    public int[] searchRange(int[] nums, int target) {
        int[] arr = new int[2];
        arr[0] = search(nums,target,false);
        arr[1] = search(nums,target,true);
        return arr;
    }

    private int search(int[] nums, int target, boolean flag) {
        int l =0;
        int r =nums.length-1;
        while (l<=r){
            int mid = (l+r)/2;
            if(nums[mid]==target){
                if(flag){
                    l=mid+1;
                }else{
                    r=mid-1;
                }
            }else if(nums[mid]>target){
                r=mid-1;
            }else{
                l=mid+1;
            }
        }
        if(flag){
            if(r<0||nums[r]!=target){
                return -1;
            }
        }else{
            if(l>=nums.length||nums[l]!=target){
                return -1;
            }
        }
        return flag?r:l;
    }
}
