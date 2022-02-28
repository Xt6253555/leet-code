package one_one;

import java.util.Stack;

//最长有效括号
public class demo32 {
    //输入：s = ")()())"
    //输出：4
    public static void main(String[] args) {
        System.out.println(longestValidParentheses("()(()"));
    }
    public static int longestValidParentheses(String s) {
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
        return s.length()+r-2*r;
    }
}
