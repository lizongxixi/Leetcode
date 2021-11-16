package binaryTree;

/**
 * @author ZONGXI LI
 * @version 1.0.0
 * @ClassName Solution101_2.java
 * @Description TODO
 * @createTime 2021年11月13日 15:54:00
 */
public class Solution101_2 {

    private boolean traversal(TreeNode left,TreeNode right){
        //其实感觉相当于层序遍历

        if(left == null && right == null) return true;
        else if(left == null && right != null) return false;
        else if(left != null && right == null) return false;
        else if(left != null && right != null && left.val != right.val) return false;
        //此时才是左节点右节点不为空，且值相等的情况，往下一层遍历
        boolean outside = traversal(left.left,right.right);
        boolean inside = traversal(left.right,right.left);
        return outside&&inside;
    }
    public boolean isSymmetric(TreeNode root) {
        if(root == null) return true;
        return traversal(root.left,root.right);
    }
}
