package binaryTree;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @author ZONGXI LI
 * @version 1.0.0
 * @ClassName Solution104_2.java
 * @Description TODO
 * @createTime 2021年11月12日 15:26:00
 */
public class Solution104_2 {
    //层序
    public int maxDepth(TreeNode root) {
        if(root == null) return 0;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        int ans = 0;
        while(!queue.isEmpty()){
            int size = queue.size();
            ans++;
            for (int i = 0;i < size;i++){
                TreeNode cur = queue.poll();
                if(cur.left != null) queue.offer(cur.left);
                if(cur.right != null) queue.offer(cur.right);
            }
        }
        return ans;
    }
    //递归
    private int traversal(TreeNode root){
        if(root == null) return 0;
        int left = traversal(root.left)+1;
        int right = traversal(root.right)+1;
        return left > right ? left : right;
    }
    public int maxDepth1(TreeNode root) {
        return traversal(root);
    }
}
