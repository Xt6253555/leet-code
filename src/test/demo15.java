package test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class demo15 {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        Arrays.sort(nums);
        for (int i = 0; i < nums.length-2; i++) {
            if(i>0&&nums[i-1]==nums[i])continue;
            int l = i+1;
            int r = nums.length-1;
            while (l<r){
                int sum = nums[i]+nums[l]+nums[r];
                if(sum==0){
                    List<Integer> arr = new ArrayList<>();
                    arr.add(nums[i]);
                    arr.add(nums[l]);
                    arr.add(nums[r]);
                    list.add(arr);
                    while (l<r&&nums[l++]==nums[l]);
                    while (l<r&&nums[r--]==nums[r]);
                }else if(sum>0){
                    while (l<r&&nums[r--]==nums[r]);
                }else{
                    while (l<r&&nums[l++]==nums[l]);
                }
            }
        }
        return list;
    }
}
