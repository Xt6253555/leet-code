package three_one;

import java.util.LinkedList;
import java.util.List;

//全排列
public class demo46 {
    public static void main(String[] args) {
        int [] arr = {1,2,3};
        List<List<Integer>> permute = permute(arr);
        System.out.println(permute);
    }
    static List<List<Integer>> res = new LinkedList<>();
    public static List<List<Integer>> permute(int[] nums) {
        LinkedList<Integer> list = new LinkedList<>();
        backtrack(nums,list);
        return res;
    }
    public static void backtrack(int[] nums,LinkedList<Integer> list){
        // 排除不合法的选择
        if(list.size()==nums.length){
            res.add(new LinkedList<>(list));
        }
        for (int i = 0; i < nums.length; i++) {
            if(list.contains(nums[i]))continue;
            //做选择，添加
            list.add(nums[i]);
            backtrack(nums,list);
            //撤销操作，向上回滚
            list.removeLast();
        }
    }
}
