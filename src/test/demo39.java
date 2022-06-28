package test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//组合总和
public class demo39 {
    List<List<Integer>> res = new ArrayList<>();
    List<Integer> list = new ArrayList<>();
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        Arrays.sort(candidates);
        dfs(candidates,0,target);
        return res;
    }
    public void dfs(int [] candidates,int len,int target){
        if(target==0){
            res.add(new ArrayList<>(list));
        }
        for(int i = len;i<candidates.length;i++){
            if(target-candidates[i]<0){
                break;
            }
            list.add(candidates[i]);
            dfs(candidates,i,target-candidates[i]);
            list.remove(list.size()-1);
        }
    }
}
