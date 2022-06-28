package test;

import java.util.ArrayList;
import java.util.List;
//子集
public class demo78 {
    List<List<Integer>> res = new ArrayList<>();
    List<Integer> list = new ArrayList<>();
    public List<List<Integer>> subsets(int[] nums) {
        backtrack(nums,list,0);
        return res;
    }

    private void backtrack(int[] nums, List<Integer> list, int start) {
        res.add(new ArrayList<>(list));
        for (int i = start; i < nums.length; i++) {
            list.add(nums[i]);
            backtrack(nums,list,i+1);
            list.remove(list.size()-1);
        }
    }
}
