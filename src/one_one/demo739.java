package one_one;

import java.util.Arrays;
import java.util.Stack;

//每日温度
public class demo739 {
    //输入: temperatures = [73,74,75,71,69,72,76,73]
    //输出: [1,1,4,2,1,1,0,0]
    public static void main(String[] args) {
        int[] arr = {73,74,75,71,69,72,76,73};
        System.out.println(Arrays.toString(dailyTemperatures(arr)));
    }
    public static int[] dailyTemperatures(int[] temperatures) {
        int[] res = new int[temperatures.length];
        Stack<Integer> stack = new Stack<>();

        for (int i = temperatures.length - 1; i >= 0; i--) {
            while (!stack.isEmpty()&&temperatures[stack.peek()]<=temperatures[i]){
                stack.pop();
            }
            res[i] = stack.isEmpty()?0:stack.peek()-i;
            stack.push(i);
        }
        return res;
    }
}
