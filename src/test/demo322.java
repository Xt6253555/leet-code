package test;

import java.util.Arrays;

//零钱兑换
public class demo322 {
    int[] memo;
    public int coinChange(int[] coins, int amount) {
        memo = new int[amount+1];
        Arrays.fill(memo,-6);
        return dp(coins,amount);
    }
    public int dp(int[] coins, int amount) {
        if(amount==0)return 0;
        if(amount<0)return -1;
        if(memo[amount]!=-6)return memo[amount];
        int res = Integer.MAX_VALUE;
        for (int coin : coins) {
            int sub = dp(coins, amount-coin);
            if(sub==-1)continue;
            res = Math.min(sub+1,res);
        }
        memo[amount] = (res==Integer.MAX_VALUE)?-1:res;
        return memo[amount];
    }
}
