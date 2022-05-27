package test;

import java.util.Stack;

public class demo20 {
    public static void main(String[] args) {
        System.out.println(isValid("{[]}"));
    }
    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '(' || c == '[' || c == '{') {
                stack.push(c);
            }
            if(!stack.isEmpty()){
                if(c==')'){
                    if(stack.pop()!='(')return false;
                }else if(c==']'){
                    if(stack.pop()!='[')return false;
                }else if(c=='}'){
                    if(stack.pop()!='{')return false;
                }
            }else{
                return false;
            }
        }
        return stack.isEmpty();
    }
}
