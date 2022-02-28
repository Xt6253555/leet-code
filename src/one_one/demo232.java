package one_one;

import java.util.Stack;

//用栈实现队列
public class demo232 {
    private Stack<Integer> s1, s2;
    public demo232() {
        s1 = new Stack<>();
        s2 = new Stack<>();
    }
    public void push(int x) {
        while(!s1.isEmpty())s2.push(s1.pop());
        s2.push(x);
        while(!s2.isEmpty())s1.push(s2.pop());
    }
    //删除队头的元素并返回
    public int pop() {
        return s1.pop();
    }
    //返回头元素
    public int peek() {
        return  s1.peek();
    }

    public boolean empty() {
        return s1.isEmpty();
    }
}
