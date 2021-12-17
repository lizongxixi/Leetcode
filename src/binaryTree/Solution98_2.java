package binaryTree;

/**
 * @author ZONGXI LI
 * @version 1.0.0
 * @ClassName Solution98_2.java
 * @Description TODO
 * @createTime 2021年12月17日 16:17:00
 */
//利用二叉搜索树中序遍历是一个递增数组进行解题
public class Solution98_2 {
    long min  = Long.MIN_VALUE;
    public boolean isValidBST(TreeNode root) {
        if (root == null) return true;
        boolean left,right;
        left = isValidBST(root.left);
        if (root.val > min){
            min =(long) root.val;
        }else{
            return false;
        }
        right = isValidBST(root.right);
        return left && right;
    }
}
