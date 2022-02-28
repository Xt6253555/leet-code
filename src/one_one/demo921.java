package one_one;

import java.util.Stack;

//使括号有效的最少添加
public class demo921 {
    public static void main(String[] args) {
        System.out.println(minAddToMakeValid("()"));
    }
    //()))((
    public static int minAddToMakeValid(String s) {
        int l = 0;
        int r = 0;
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            if(c=='('){
                stack.push(c);
                l++;
            }else{
                if(l!=0){
                    stack.pop();
                    l--;
                }else{
                    stack.push(c);
                }
            }
        }
        while (!stack.isEmpty()){
            stack.pop();
            r++;
        }
        return r;
    }
}
