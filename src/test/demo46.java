package test;

import java.util.LinkedList;
import java.util.List;

//全排列
public class demo46 {
    List<List<Integer>> res = new LinkedList<>();
    public List<List<Integer>> permute(int[] nums) {
        LinkedList<Integer> list = new LinkedList<>();
        backtrack(nums,list);
        return res;
    }
    public void backtrack(int[] nums,LinkedList<Integer> list){
        if(list.size()==nums.length){
            res.add(new LinkedList<>(list));
        }
        for (int i = 0; i < nums.length; i++) {
            if(list.contains(nums[i]))continue;
            list.add(nums[i]);
            backtrack(nums,list);
            list.removeLast();
        }
    }
}
