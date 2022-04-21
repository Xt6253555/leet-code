package three_one;

//划分为k个相等的子集
public class demo698 {
    public boolean canPartitionKSubsets(int[] nums, int k) {
        // 排除⼀些基本情况
        if (k > nums.length) return false;
        int sum = 0;
        for (int v : nums) sum += v;
        if (sum % k != 0) return false;
        boolean[] used = new boolean[nums.length];
        int target = sum / k;
        // k 号桶初始什么都没装，从 nums[0] 开始做选择
        return backtrack(k, 0, nums, 0, used, target);
    }
    // 递归穷举 nums 中的每个数字
    public boolean backtrack(int k, int  bucket, int[] nums, int start, boolean[] used, int target) {
        if(k==0)return true;
        //递归下一个桶
        if(bucket==target)return backtrack(k-1,0,nums,0,used,target);
        for (int i = start; i < nums.length; i++) {
            //数字已经使用过
            if(used[i])continue;
            //桶装不下数字
            if(nums[i]+bucket>target)continue;
            used[i] = true;
            bucket+=nums[i];
            if(backtrack(k,bucket,nums,i+1,used,target))return true;
            used[i] = false;
            bucket-=nums[i];
        }
        return false;
    }
}
