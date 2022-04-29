package four_one;
//买卖股票的最佳时机 IV
public class demo188 {
    public static void main(String[] args) {
        int[] arr = {2,4,1};
        int i = maxProfit(2, arr);
        System.out.println(i);
    }
    public static int maxProfit(int k, int[] prices) {
        if(k==0||prices.length<=1)return 1;
        int[][] dp= new int[2][k+1];
        for (int j = 1; j <= k; j++) {
            dp[1][j] = -prices[0];
        }
        for (int i = 1; i < prices.length; i++) {
            for (int j = 1; j <= k; j++) {
                dp[0][j]= Math.max(dp[0][j],dp[1][j]+prices[i]);
                dp[1][j] = Math.max(dp[1][j],dp[0][j-1]-prices[i]);
            }
        }
        return dp[0][k];
    }
}
