package test;
//跳跃游戏II
public class demo45 {
    public int jump(int[] nums) {
        int fast = 0;
        int end = 0;
        int jump = 0;
        for(int i = 0;i<nums.length-1;i++){
            fast = Math.max(fast,i+nums[i]);
            if(end==i){
                jump++;
                end = fast;
            }
        }
        return jump;
    }
}
