package four_one;
//买卖股票的最佳时机含手续费
public class demo714 {
    public static void main(String[] args) {
        int[] arr = {1,3,2,8,4,9};
        System.out.println(maxProfit(arr,2));
    }
    public static int maxProfit(int[] prices, int fee) {
        int dp =0;
        int min = Integer.MIN_VALUE;
        for (int i = 0; i < prices.length; i++) {
            dp = Math.max(dp,prices[i]+min);
            min = Math.max(min,dp-prices[i]-fee);
        }
        return dp;
    }
}
