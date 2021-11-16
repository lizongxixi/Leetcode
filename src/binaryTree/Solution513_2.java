package binaryTree;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author ZONGXI LI
 * @version 1.0.0
 * @ClassName Solution513_2.java
 * @Description TODO
 * @createTime 2021年11月14日 15:26:00
 */
public class Solution513_2 {
    int res = 0;
    int depth = Integer.MIN_VALUE;
    private void traversal(TreeNode root,int len){
        if(root.right == null && root.left == null){
            if(depth < len){
                depth = len;
                res = root.val;
            }
        }
        if(root.left != null){
            len++;
            traversal(root.left,len);
            len--;
        }
        if(root.right!= null){
            len++;
            traversal(root.right,len);
            len--;
        }
        return;
    }
    public int findBottomLeftValue(TreeNode root) {
        traversal(root,0);
        return res;
    }

    //层序很简单，记录每一层的第一个值就行
    public int findBottomLeftValue1(TreeNode root) {
        if (root == null) return 0;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        int ans = 0;
        while(!queue.isEmpty()){
            int size = queue.size();
            for(int i = 0;i < size;i++){
                TreeNode cur = queue.poll();
                if(i == 0) ans = cur.val;
                if(cur.left != null) queue.offer(cur.left);
                if(cur.right != null) queue.offer(cur.right);
            }
        }
        return ans;
    }
}
