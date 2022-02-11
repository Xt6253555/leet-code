package one_one;

public class demo303 {
    private int[] arr;
    public demo303(int[] nums) {
//        构建前缀和
        int n = nums.length;
        arr = new int[n+1];
        for (int i = 0; i < n; i++) {
            arr[i+1] = nums[i]+arr[i];
        }
    }

    public int sumRange(int left, int right) {
        return arr[right+1]-arr[left];
    }
}
