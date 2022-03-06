package one_one;

import java.util.Stack;
//不同字符的最小序列(类似316)
public class demo1081 {
    public String smallestSubsequence(String s) {
        Stack<Character> stack = new Stack<>();
        int[] count = new int[256];
        boolean[] flag = new boolean[256];
        for (int i = 0; i < s.length(); i++) {
            count[s.charAt(i)]++;
        }
        for (char c : s.toCharArray()) {
            count[c]--;
            if(flag[c])continue;
            while (!stack.isEmpty()&&stack.peek()>c){
                if(count[stack.peek()]==0){
                    break;
                }else{
                    flag[stack.pop()] = false;
                }
            }
            stack.push(c);
            flag[c] = true;
        }
        StringBuilder stringBuilder = new StringBuilder();
        while (!stack.isEmpty()){
            stringBuilder.append(stack.pop());
        }
        return stringBuilder.reverse().toString();
    }
}
