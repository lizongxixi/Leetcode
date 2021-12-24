package binaryTree;

/**
 * @author ZONGXI LI
 * @version 1.0.0
 * @ClassName Solution518_2.java
 * @Description TODO
 * @createTime 2021年12月23日 23:02:00
 */
public class Solution518_2 {
    //右中左的遍历顺序
    TreeNode pre = new TreeNode(0);
    public TreeNode convertBST(TreeNode root) {
        if (root == null){
            return null;
        }

        root.right = convertBST(root.right);
        root.val = root.val + pre.val;
        pre = root;
        root.left = convertBST(root.left);
        return root;
    }
}
