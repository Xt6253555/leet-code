package test;

public class demo303 {
    int [] arr;
    public demo303(int[] nums) {
        arr = new int[nums.length+1];
        arr[0]=0;
        //-2 0 3 -5 2 -1
        //0 -2 -2 1 -4 -2 -3
        for (int i = 0; i < nums.length; i++) {
            arr[i+1]=arr[i]+nums[i];
        }
    }

    public int sumRange(int left, int right) {
        return arr[right+1]-arr[left];
    }
}
