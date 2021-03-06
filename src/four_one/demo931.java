package four_one;

import java.util.Arrays;

//下降路径最小和
public class demo931 {
    public static void main(String[] args) {
        int[][] arr = {{2,1,3},{6,5,4},{7,8,9}};
        demo931 demo931 = new demo931();
        int i = demo931.minFallingPathSum(arr);
        System.out.println(i);
    }
    //消除子问题
    int[][] memo;
    int minFallingPathSum(int[][] matrix){
        int n = matrix.length;
        int res = Integer.MAX_VALUE;
        memo = new int[n][n];
        for (int i = 0; i < n; i++) {
            Arrays.fill(memo[i],6666);
        }
        for (int j = 0; j < n; j++) {
            res = Math.min(res,dp(matrix,n-1,j));
        }
        return res;
    }

    private int dp(int[][] matrix, int i, int j) {
        int n = matrix.length;
        if(i<0||j<0||i>=n||j>=n)return 6666;
        if(i==0)return matrix[0][j];
        if(memo[i][j]!=6666)return memo[i][j];
        memo[i][j] = matrix[i][j]+min(dp(matrix,i-1,j-1),dp(matrix,i-1,j),dp(matrix,i-1,j-+1));
        return memo[i][j];
    }
    private int min(int a,int b,int c){
        return Math.min(a,Math.min(b,c));
    }
}
