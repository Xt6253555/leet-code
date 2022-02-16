package one_one;

import java.util.HashMap;

//和为K的子数组(前缀和)
public class demo560 {
    //
    public static void main(String[] args) {
        int[] arr = {1,1,1};
        //0,1,2,3
        System.out.println(subarraySum(arr,2));
    }
    public static int subarraySum(int[] nums, int k) {
        int l =0;
        int sum = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0,1);
        for (int i = 0; i < nums.length; i++) {
            l+=nums[i];
            int r = l-k;
            if(map.containsKey(r)){
                sum+=map.get(r);
            }
            map.put(l,map.getOrDefault(l,0)+1);

        }
        return sum;
    }
}
