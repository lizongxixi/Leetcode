package binaryTree;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @author ZONGXI LI
 * @version 1.0.0
 * @ClassName Solution429_2.java
 * @Description TODO
 * @createTime 2021年11月12日 14:59:00
 */
public class Solution429_2 {
    class Node {
        public int val;
        public List<Node> children;

        public Node() {}

        public Node(int _val) {
            val = _val;
        }

        public Node(int _val, List<Node> _children) {
            val = _val;
            children = _children;
        }
    };
    public List<List<Integer>> levelOrder(Node root) {
        List<List<Integer>> ans = new LinkedList<>();
        if(root == null) return ans;
        Queue<Node> queue = new LinkedList<>();
        queue.offer(root);
        while(!queue.isEmpty()){
            int size = queue.size();
            List<Integer> path = new LinkedList<>();
            for (int i = 0;i < size;i++){
                Node cur = queue.poll();
                path.add(cur.val);
                for (Node node : cur.children){
                    if(node != null) queue.offer(node);
                }
            }
            ans.add(path);
        }
        return ans;
    }
}
