package one_one;

import java.util.Stack;

//输入：s = "([)]"
//输出：false
//输入：s = "()[]{}"
//输出：true
//输入：s = "{[]}"
//输出：true
//有效的括号
public class demo20 {
    public static void main(String[] args) {
        System.out.println(isValid("{[]}"));
    }
    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            if(c=='('||c=='['||c=='{'){
                stack.push(c);
            }
            if (!stack.isEmpty()) {
                if (c == ')' && '(' != stack.pop()) {
                    return false;
                } else if (c == ']' && '[' != stack.pop()) {
                    return false;
                } else if (c == '}' && '{' != stack.pop()) {
                    return false;
                }
            } else {
                return false;
            }
        }
        return stack.isEmpty();
    }
}
