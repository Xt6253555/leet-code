package five_one;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//四数之和
public class demo18 {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums);
        if(nums.length<4)return res;

        for (int i = 0; i < nums.length - 3; i++) {
            if ((long)nums[i] + nums[i + 1] + nums[i + 2] + nums[i + 2] > target) break;
            if (i > 0 && nums[i] == nums[i - 1]) continue;//去重

            for (int j = i + 1; j < nums.length - 2; j++) {
                if ((long)nums[i] + nums[j] + nums[j + 1] + nums[j + 2] > target) break;
                if (j > i + 1 && nums[j] == nums[j - 1]) continue;//去重

                int l = j+1;
                int r = nums.length-1;
                while (l<r){
                    int sum = nums[i]+nums[j]+nums[l]+nums[r];
                    if(sum==target){
                        res.add(new ArrayList<>(Arrays.asList(nums[i],nums[j],nums[l],nums[r])));
                        while (l<r&&nums[l++]==nums[l]);
                        while (l<r&&nums[r--]==nums[r]);
                    }else if (sum<target){
                        while (l<r&&nums[l++]==nums[l]);
                    }else{
                        while (l<r&&nums[r--]==nums[r]);
                    }
                }
            }
        }
        return res;
    }
}
