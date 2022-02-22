package one_one;

import java.util.Arrays;
import java.util.PriorityQueue;

//优势洗牌(田忌赛马)
public class demo870 {
    public int[] advantageCount(int[] nums1, int[] nums2) {
        int n = nums1.length;
        PriorityQueue<int[]> queue = new PriorityQueue<>(
                (int[] pair1,int[] pair2)->{
                 return pair2[1]-pair1[1];
                }
        );
        Arrays.sort(nums1);
        for (int i = 0; i < n; i++) {
            queue.offer(new int[]{i,nums2[i]});
        }
        int[] res = new int[n];
        int left=0,right=n-1;
        while (!queue.isEmpty()){
            int[] poll = queue.poll();
            int i = poll[0];
            int pair = poll[1];
            if(nums1[right]>pair){
                res[i] = nums1[right];
                right++;
            }else{
                res[i] = nums1[left];
                left++;
            }
        }
        return res;
    }
}
