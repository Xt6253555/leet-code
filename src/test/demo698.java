package test;
//划分为k个相等的子集
public class demo698 {
    public boolean canPartitionKSubsets(int[] nums, int k) {
        if(k>nums.length)return false;
        int sum = 0;
        for (int num : nums) sum+=num;
        if(sum%k!=0)return false;
        int target = sum/k;
        boolean[] user = new boolean[nums.length];
        return backtrack(k,0,user,nums,0,target);
    }

    private boolean backtrack(int k, int buckets, boolean[] user, int[] nums, int start, int target) {
        if (k==0)return true;
        if(target==buckets)return backtrack(k-1,0,user,nums,0,target);
        for (int i = start; i < nums.length; i++) {
            if(user[i])continue;
            if(buckets+nums[i]>target)continue;
            buckets+=nums[i];
            user[i] = true;
            if(backtrack(k,buckets,user,nums,i+1,target))return true;
            buckets-=nums[i];
            user[i]=false;
        }
        return false;
    }
}
