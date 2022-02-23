package one_one;
//删除有序数组中的重复项
public class demo26 {
    //22334
    public int removeDuplicates(int[] nums) {
        int slow = 0;
        for (int i = 0; i < nums.length-1; i++) {
            if(nums[i]!=nums[i+1]){
                slow++;
                nums[slow] = nums[i+1];
            }
        }
        return slow+1;
    }
}
