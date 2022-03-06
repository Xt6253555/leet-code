package one_one;

import java.util.Arrays;
import java.util.Stack;

//去除重复字母
public class demo316 {
    public static void main(String[] args) {
        System.out.println(removeDuplicateLetters("cbacdcbc"));
    }
    public static String removeDuplicateLetters(String s) {
        int[] count = new int[256];
        for (int i = 0; i < s.length(); i++) {
            count[s.charAt(i)]++;
        }
        Stack<Character> stack = new Stack<>();
        boolean[] flag = new boolean[256];
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
            flag[c]=true;
        }
        StringBuilder sb = new StringBuilder();
        while (!stack.isEmpty()){
            sb.append(stack.pop());
        }
        return sb.reverse().toString();
    }
}
