package Stack_and_Que;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author ZONGXI LI
 * @version 1.0.0
 * @ClassName Solution255_2.java
 * @Description TODO
 * @createTime 2021年11月11日 18:40:00
 */
public class Solution255_2 {
    class MyStack {
        private Queue<Integer> queue1 ;
        private Queue<Integer> queue2;
        private int size;
        public MyStack() {
            queue1 = new LinkedList<>();
            queue2 = new LinkedList<>();
            size = 0;
        }

        public void push(int x) {
            size++;
            queue1.offer(x);
        }

        public int pop() {
            size--;
            int qSize = queue1.size();
            for(int i = 0;i < qSize-1;i++){
                queue2.offer(queue1.poll());
            }
            int res = queue1.poll();
            while(!queue2.isEmpty()){
                queue1.offer(queue2.poll());
            }
            return res;
        }

        public int top() {
            int qSize = queue1.size();
            for(int i = 0;i < qSize-1;i++){
                queue2.offer(queue1.poll());
            }
            int res = queue1.peek();
            queue2.offer(queue1.poll());
            while(!queue2.isEmpty()){
                queue1.offer(queue2.poll());
            }
            return res;
        }

        public boolean empty() {
            return size == 0;
        }
    }
}
