package binaryTree;

/**
 * @author ZONGXI LI
 * @version 1.0.0
 * @ClassName Solution111_2.java
 * @Description TODO
 * @createTime 2021年11月12日 15:42:00
 */
public class Solution111_2 {
    private int traversal(TreeNode root){
        if(root == null) return 0;
        int left = traversal(root.left);
        int right = traversal(root.right);
        if(left == 0) return right + 1;
        if(right == 0) return left + 1;
        return (right > left ? left : right)+1 ;
    }
    public int minDepth(TreeNode root) {
        return traversal(root);
    }
}
