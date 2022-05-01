package five_one;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//三数之和
public class demo15 {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums);
        for (int i = 0; i < nums.length-2; i++) {
            if(nums[i]+ nums[i + 1] + nums[i + 2]>0)break;
            if(i>0&&nums[i]==nums[i-1])continue;//去重
            int l = i+1;
            int r=nums.length-1;
            while (l<r){
                int sum = nums[i]+nums[l]+nums[r];
                if(sum==0){
                    res.add(new ArrayList<>(Arrays.asList(nums[i],nums[l],nums[r])));
                    while (l<r&&nums[l++]==nums[l]);//左边去重
                    while (l<r&&nums[r--]==nums[r]);//右边去重
                }else if(sum<0){
                    while (l<r&&nums[l++]==nums[l]);
                }else{
                    while (l<r&&nums[r--]==nums[r]);
                }
            }
        }
        return res;
    }
}
