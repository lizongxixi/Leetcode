package binaryTree;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @author ZONGXI LI
 * @version 1.0.0
 * @ClassName Solution515_2.java
 * @Description TODO
 * @createTime 2021年11月12日 15:09:00
 */
public class Solution515_2 {
    public List<Integer> largestValues(TreeNode root) {
        List<Integer> res = new LinkedList<>();
        if(root == null) return res;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while(!queue.isEmpty()){
            int size = queue.size();
            int max = Integer.MIN_VALUE;
            for (int i = 0;i < size;i++){
                TreeNode cur = queue.poll();
                if(cur.left != null) queue.offer(cur.left);
                if(cur.right != null) queue.offer(cur.right);
                max = max > cur.val ? max : cur.val;
            }
            res.add(max);
        }
        return res;
    }
}
