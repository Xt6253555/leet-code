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
        int min = 0;
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                min+=nums[i];
                if(min==k){
                    sum++;
                    min=0;
                    break;
                }
            }
        }
        return sum;
    }
}
