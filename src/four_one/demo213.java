package four_one;
//打家劫舍II
public class demo213 {
    public int rob(int[] nums) {
        int n = nums.length;
        if (n == 1) return nums[0];
        return Math.max(robV2(nums,0,n-1),robV2(nums,1,n));
    }
    public int robV2(int[] nums,int l,int r) {
        int dp = 0;
        int dp1 = 0;
        int dp2 = 0;
        for (int i = l; i < r; i++) {
            dp=Math.max(dp1,dp2+nums[i]);
            dp2=dp1;
            dp1 = dp;
        }
        return dp;
    }
}
