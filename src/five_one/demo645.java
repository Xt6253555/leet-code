package five_one;

import java.util.Arrays;
import java.util.HashSet;

//错误的集合
//12335
//13345
//22
public class demo645 {
    public static void main(String[] args) {
        int[] arr = {1,3,3,4};
        int[] errorNums = findErrorNums(arr);
    }
    public static int[] findErrorNums(int[] nums) {
        int[]arr = new int[2];
        int n = nums.length;
        int[]res = new int[n+1];
        for (int num : nums) res[num]++;
        for (int i = 1; i <= n; i++) {
            if(res[i]==0)arr[1]=i;
            if(res[i]==2)arr[0]=i;
        }
        return arr;
    }
}
