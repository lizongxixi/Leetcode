package binaryTree;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author ZONGXI LI
 * @version 1.0.0
 * @ClassName Solution226_2.java
 * @Description TODO
 * @createTime 2021年11月13日 15:40:00
 */
public class Solution226_2 {
    //递归后序遍历
    private TreeNode traversal(TreeNode root){
        if(root == null) return null;
        TreeNode left = traversal(root.left);
        TreeNode right = traversal(root.right);
        root.right = left;
        root.left = right;
        return root;
    }
    public TreeNode invertTree(TreeNode root) {
        return traversal(root);
    }
    //层序遍历
    public TreeNode invertTree1(TreeNode root) {
        if(root == null) return null;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while(!queue.isEmpty()){
            int size = 0;
            for(int i = 0;i < queue.size();i++){
                TreeNode cur = queue.poll();
                swap(cur);
                if(cur.left!=null) queue.offer(cur.left);
                if(cur.right!=null) queue.offer(cur.right);
            }
        }
        return root;
    }
    private void swap(TreeNode root){
        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;
    }
}
