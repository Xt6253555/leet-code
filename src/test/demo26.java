package test;

public class demo26 {
    public static void main(String[] args) {
        int[]arr = {};
        int i = removeDuplicates(arr);
        System.out.println(i);
    }
    public static int removeDuplicates(int[] nums) {
        int count=1;
        for (int i = 0; i < nums.length-1; i++) {
            if(nums[i]!=nums[i+1]){
                nums[count]=nums[i+1];
                count++;
            }
        }
        return count;
    }
}
