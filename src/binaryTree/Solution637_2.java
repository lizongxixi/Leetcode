package binaryTree;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @author ZONGXI LI
 * @version 1.0.0
 * @ClassName Solution637_2.java
 * @Description TODO
 * @createTime 2021年11月12日 14:57:00
 */
public class Solution637_2 {
    public List<Double> averageOfLevels(TreeNode root) {
        List<Double> res = new LinkedList<>();
        if(root == null) return res;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while(!queue.isEmpty()){
            int size = queue.size();
            double ans = 0;
            for (int i = 0;i < size;i++){
                TreeNode cur = queue.poll();
                if(cur.left != null) queue.offer(cur.left);
                if(cur.right != null) queue.offer(cur.right);
                ans += cur.val;
            }
            res.add(ans/size);
        }
        return res;
    }
}
