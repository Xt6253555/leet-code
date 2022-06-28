package test;
//斐波那契数
public class demo509 {
    public int fib(int n) {
        int[] dp = new int[n+1];
        return help(dp,n);
    }
    public int help(int[] dp, int n){
        if(n==0)return 0;
        if(n==1)return 1;
        if(dp[n]!=0)return dp[n];
        dp[n] = help(dp,n-1)+help(dp,n-2);
        return dp[n];
    }
}
