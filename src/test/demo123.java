package test;
//买卖股票的最佳时机 III
public class demo123 {
    public static void main(String[] args) {
        int[] arr = {2,1,2,0,1};
        System.out.println(maxProfit(arr));
    }
    public static int maxProfit(int[] prices) {
        int dp1 = 0;
        int dp2 = 0;
        int min1 = Integer.MIN_VALUE;
        int min2 = Integer.MIN_VALUE;
        for (int i = 0; i < prices.length; i++) {
            dp1 = Math.max(dp1,prices[i]+min1);
            min1 = Math.max(min1,-prices[i]);
            dp2 = Math.max(dp2,min2+prices[i]);
            min2 = Math.max(min2,dp1-prices[i]);
        }
        return dp2;
    }
}
