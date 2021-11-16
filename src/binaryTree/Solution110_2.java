package binaryTree;

/**
 * @author ZONGXI LI
 * @version 1.0.0
 * @ClassName Solution110_2.java
 * @Description TODO
 * @createTime 2021年11月14日 10:49:00
 */
public class Solution110_2 {
    private int traversal(TreeNode root){
        if(root == null) return 0;
        int left = traversal(root.left);
        if(left == -1) return -1;
        int right = traversal(root.right);
        if(right == -1) return -1;
        return Math.abs(right - left) > 1 ? -1 : Math.max(left,right) + 1;
    }
    public boolean isBalanced(TreeNode root) {
        return traversal(root) == -1 ? false : true;
    }
}
