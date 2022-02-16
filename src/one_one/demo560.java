package one_one;
//和为K的子数组
public class demo560 {
    //
    public static void main(String[] args) {
        int[] arr = {1,2,1,2,1};
        System.out.println(subarraySum(arr,3));
    }
    public static int subarraySum(int[] nums, int k) {
        int sum = 0;
        int n = nums.length;
        int[] arr = new int[n+1];
        for (int i = 0; i < n-1; i++) {
            for (int j = i+1; j < n; j++) {
                int a = arr[i]+arr[j];
            }
        }
        return sum;
    }
}
