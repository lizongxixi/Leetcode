package binaryTree;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @author ZONGXI LI
 * @version 1.0.0
 * @ClassName Solution102_2.java
 * @Description TODO
 * @createTime 2021年11月12日 12:17:00
 */
public class Solution102_2 {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> ans = new LinkedList<>();
        if(root == null) return ans;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while(!queue.isEmpty()){
            int size = queue.size();
            List<Integer> path = new LinkedList<>();
            for (int i = 0;i < size;i++){
                TreeNode cur = queue.poll();
                path.add(cur.val);
                if(cur.left != null) queue.offer(cur.left);
                if (cur.right != null) queue.offer(cur.right);
            }
            ans.add(path);
        }
        return ans;
    }
}
