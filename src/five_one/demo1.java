package five_one;

import java.util.Arrays;
import java.util.HashMap;

//两数之和
public class demo1 {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int[] arr = new int[2];
        for (int i = 0; i < nums.length; i++){
            if(map.containsKey(target-nums[i])){
                arr[0]=i;
                arr[1]=map.get(target-nums[i]);
            }
            map.put(nums[i],i);
        }
        return arr;
    }
}
