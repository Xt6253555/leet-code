package test;

import java.util.Arrays;
import java.util.PriorityQueue;

public class demo870 {
    public static void main(String[] args) {
        int[] arr1 = {2,7,11,15};
        int[] arr2 = {1,10,4,11};
        int[] ints = advantageCount(arr1, arr2);
        System.out.println(Arrays.toString(ints));
    }
    public static int[] advantageCount(int[] nums1, int[] nums2) {
        int n = nums1.length;
        PriorityQueue<int[]> queue = new PriorityQueue<>(
                (int[] pair1,int[] pair2)->{
                    return pair2[1]-pair1[1];
                }
        );
        for (int i = 0; i < n; i++) {
            queue.offer(new int[]{i,nums2[i]});
        }
        Arrays.sort(nums1);
        int[] res = new int[n];
        int l =0;
        int r =n-1;
        while (!queue.isEmpty()){
            int[] poll = queue.poll();
            int i = poll[0];
            int maxVal = poll[1];
            if(nums1[r]>maxVal){
                res[i]=nums1[r];
                r--;
            }else{
                res[i]=nums1[l];
                l++;
            }
        }
        return res;
    }
}
