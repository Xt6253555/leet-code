package test;

public class demo560 {
    public int subarraySum(int[] nums, int k) {
        int[] arr = new int[nums.length+1];
        for (int i = 0; i < nums.length; i++) {
            arr[i+1] = nums[i]+arr[i];
        }
        int count = 0;
        for (int i = 1; i < arr.length; i++) {
            if(arr[i]==k)count++;
            for (int j = i+1; j < arr.length; j++) {
                if(arr[j]-arr[i]==k)count++;
            }
        }
        return count;
    }
}
