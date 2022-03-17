package one_one;

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
            //判断栈里面有类似元素直接返回
            if(flag[c])continue;
            while (!stack.isEmpty()&&stack.peek()>c){
                //判断后面无相同元素，返回
                if(count[stack.peek()]==0){
                    break;
                }
                //栈弹出的元素置为false，可再次入栈
                flag[stack.pop()] = false;
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
