package four_one;
//买卖股票的最佳时机 II
public class demo122 {
    public int maxProfit(int[] prices) {
        int dp = 0;
        for (int i = 0; i < prices.length - 1; i++) {
            if(prices[i+1]-prices[i]>0){
                dp+=prices[i+1]-prices[i];
            }
        }
        return dp;
    }
}
