package binaryTree;

/**
 * @author ZONGXI LI
 * @version 1.0.0
 * @ClassName Solution700_2.java
 * @Description TODO
 * @createTime 2021年12月17日 16:09:00
 */
public class Solution700_2 {
    public TreeNode searchBST(TreeNode root, int val) {
        if (root == null) return null;
        if(val == root.val) return root;
        if(val > root.val) return searchBST(root.right,val);
        if(val < root.val) return searchBST(root.left,val);
        return null;
    }
}
