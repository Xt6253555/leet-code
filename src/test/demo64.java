package test;

import java.util.Arrays;

//最小路径和
public class demo64 {
    int memo[][];
    public int minPathSum(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        for (int[] ints : memo) {
            Arrays.fill(ints,-1);
        }
        return dp(grid,m-1,n-1);
    }
    public int dp(int[][]grid,int i,int j){
        if(i==0&&j==0)return grid[0][0];
        if(i<0||j<0)return Integer.MAX_VALUE;
        if(memo[i][j]!=-1)return memo[i][j];
        memo[i][j] = grid[i][j]+Math.min(dp(grid,i-1,j),dp(grid,i,j-1));
        return memo[i][j];
    }
}
