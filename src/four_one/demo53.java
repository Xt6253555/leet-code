package four_one;
//最大子序和
public class demo53 {
    public int maxSubArray(int[] nums) {
        int n = nums.length;
        int[] dp = new int[n];
        dp[0] = nums[0];
        int res = Integer.MIN_VALUE;
        for (int i = 1; i < n; i++) {
            dp[i] = Math.max(nums[i],dp[i-1]+nums[i]);
        }
        for(int i = 0;i<n;i++){
            res = Math.max(res,dp[i]);
        }
        return res;
    }
}
