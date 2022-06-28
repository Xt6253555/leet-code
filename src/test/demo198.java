package test;
//打家劫舍
public class demo198 {
    public static void main(String[] args) {
        int[] arr = {2,1,1,2};
        System.out.println(rob(arr));
    }
    public static int rob(int[] nums) {
        int dp = 0;
        int dp1 = 0;
        int dp2 = 0;
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            dp=Math.max(dp1,dp2+nums[i]);
            dp2=dp1;
            dp1 = dp;
        }
        return dp;
    }
}
