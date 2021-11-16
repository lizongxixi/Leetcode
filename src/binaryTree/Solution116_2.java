package binaryTree;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @author ZONGXI LI
 * @version 1.0.0
 * @ClassName Solution116_2.java
 * @Description TODO
 * @createTime 2021年11月12日 15:15:00
 */
public class Solution116_2 {
    class Node {
        public int val;
        public Node left;
        public Node right;
        public Node next;

        public Node() {}

        public Node(int _val) {
            val = _val;
        }

        public Node(int _val, Node _left, Node _right, Node _next) {
            val = _val;
            left = _left;
            right = _right;
            next = _next;
        }
    };
    public Node connect(Node root) {
        if(root == null) return root;
        Queue<Node> queue = new LinkedList<>();
        queue.offer(root);
        while(!queue.isEmpty()){
            int size = queue.size();
            for (int i = 0;i < size;i++){
                Node cur = queue.poll();
                if (i == size-1){
                    cur.next = null;
                }else{
                    cur.next = queue.peek();
                }
                if(cur.left != null) queue.offer(cur.left);
                if(cur.right != null) queue.offer(cur.right);
            }
        }
        return root;
    }
}
