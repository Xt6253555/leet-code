package test;

import java.util.ArrayList;
import java.util.List;

public class demo22 {
    public List<String> generateParenthesis(int n) {
        List<String> res = new ArrayList<>();
        if(n==0)return res;
        dfs("", 0, 0, n, res);
        return res;
    }
    public void dfs(String s,int left,int right,int n,List<String> res){
        if(left==n&&right==n){
            res.add(s);
            return;
        }
        if(left<right)return;
        if(left<n){
            dfs(s+"(",left+1,right,n,res);
        }
        if(right<n){
            dfs(s+")",left,right+1,n,res);
        }
    }
}
