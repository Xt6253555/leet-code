package test;
//买卖股票的最佳时机
//7,1,5,3,6,4
//5
public class demo121 {
    public static void main(String[] args) {
        int []arr = {7,1,5,3,6,4};
        System.out.println(maxProfit(arr));
    }
    public static int maxProfit(int[] prices) {
       int dp = 0;
       int min = Integer.MIN_VALUE;
        for (int i = 0; i < prices.length; i++) {
            dp = Math.max(dp,min+prices[i]);
            min = Math.max(min,-prices[i]);
        }
        return dp;
    }
}
