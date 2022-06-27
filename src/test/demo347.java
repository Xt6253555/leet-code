package test;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.PriorityQueue;

//前k个高频元素
public class demo347 {
    public static void main(String[] args) {
        int[] arr = {1,1,1,2,2,3};
        int[] ints = topKFrequent(arr, 2);
    }
    public static int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int n : nums){
            map.put(n, map.getOrDefault(n, 0) + 1);
        }
        //对hashMap的value排序
        PriorityQueue<HashMap.Entry<Integer, Integer>> queue =
                new PriorityQueue<>((e1, e2) -> e2.getValue() - e1.getValue());
        queue.addAll(map.entrySet());
        int[] ans = new int[k];
        for (int i = 0; i < k; i++){
            ans[i] = queue.poll().getKey();
        }
        return ans;
    }
}
