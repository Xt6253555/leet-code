package one_one;

import java.util.Stack;

//最长有效括号
public class demo32 {
    //输入：s = ")()())"
    //输出：4
    public static void main(String[] args) {
        System.out.println(longestValidParentheses(")()())"));
    }
    public static int longestValidParentheses(String s) {
        Stack<Integer> stack = new Stack<>();
        stack.push(-1);
        int ans = 0;
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i)=='('){
                stack.push(i);
            }else{
                stack.pop();
                if(stack.isEmpty()){
                    stack.push(i);
                }
                ans = Math.max(ans,i-stack.peek());
            }
        }
        return ans;
    }
}
