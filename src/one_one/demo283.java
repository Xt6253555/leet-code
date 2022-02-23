package one_one;
//移动零
public class demo283 {
    public void moveZeroes(int[] nums) {
        int slow = 0;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i]!=0){
                nums[slow]=nums[i];
                slow++;
            }
        }
        int n = nums.length-slow;
        for (int i = nums.length - 1; n > 0; n--) {
            nums[i] = 0;
            i--;
        }
    }
}
