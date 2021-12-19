package binaryTree;

/**
 * @author ZONGXI LI
 * @version 1.0.0
 * @ClassName Solution530_2.java
 * @Description TODO
 * @createTime 2021年12月19日 18:09:00
 */
public class Solution530_2 {
    private int min = Integer.MAX_VALUE;
    TreeNode pre;
    private void traversal(TreeNode root){
        if (root == null) return;
        traversal(root.left);
        if(pre != null){
            min = root.val - pre.val < min ?  root.val - pre.val : min;
        }
        pre = root;
        traversal(root.right);
    }
    public int getMinimumDifference(TreeNode root) {
        traversal(root);
        return min;
    }
}
