package test;

public class demo283 {
    public void moveZeroes(int[] nums) {
        int count = 0;
        int l = nums.length;
        for (int i = 0; i < l; i++) {
            if (nums[i] != 0) {
                nums[count] = nums[i];
                count++;
            }
        }
        for (int i = 0; i < nums.length-count; i++) {
            nums[l-1]=0;
            l--;
        }
    }
}
