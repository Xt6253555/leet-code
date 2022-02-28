package one_one;

import java.util.LinkedList;
import java.util.Queue;

//队列实现栈
public class demo225 {
    public static void main(String[] args) {
        push(1);
        push(2);
        push(3);
        System.out.println(1);
    }
    static Queue<Integer> queue = new LinkedList<>();

    public demo225() {
    }
    //123
    public static void push(int x) {
        int size = queue.size();
        queue.offer(x);
        for (int i = 0; i < size; i++) {
            queue.offer(queue.poll());
        }
    }

    public int pop() {
        return queue.poll();
    }

    public int top() {
        return queue.peek();
    }

    public boolean empty() {
        return queue.isEmpty();
    }
}
