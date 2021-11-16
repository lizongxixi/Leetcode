package Stack_and_Que;

import java.util.Stack;

/**
 * @author ZONGXI LI
 * @version 1.0.0
 * @ClassName Solution232_2.java
 * @Description TODO
 * @createTime 2021年11月11日 17:57:00
 */
public class Solution232_2 {
    class MyQueue {
        private Stack<Integer> stack1;
        private Stack<Integer> stack2;
        private int size;
        public MyQueue() {
            stack1 = new Stack<>();
            stack2 = new Stack<>();
            size = 0;
        }
        public void push(int x) {
            stack1.push(x);
            size++;
        }
        public int pop() {
            while(!stack1.empty()){
                stack2.push(stack1.pop());
            }
            size--;
            int oldTop = stack2.pop();
            while(!stack2.empty()){
                stack1.push(stack2.pop());
            }
            return oldTop;
        }
        public int peek() {
            while(!stack1.empty()){
                stack2.push(stack1.pop());
            }
            int oldTop = stack2.peek();
            while(!stack2.empty()){
                stack1.push(stack2.pop());
            }
            return oldTop;
        }
        public boolean empty() {
            return size == 0;
        }
    }
}
