package test;
//跳跃游戏
public class demo55 {
    public boolean canJump(int[] nums) {
        int sum = 0;
        for(int i = 0;i<nums.length;i++){
            if(sum<i)return false;
            sum = Math.max(sum,i+nums[i]);
        }
        return true;
    }
}
