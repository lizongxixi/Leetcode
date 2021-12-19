package binaryTree;

/**
 * @author ZONGXI LI
 * @version 1.0.0
 * @ClassName Solution701_2.java
 * @Description TODO
 * @createTime 2021年12月19日 19:35:00
 */
public class Solution701_2 {
    public TreeNode insertIntoBST(TreeNode root, int val) {
        TreeNode node = new TreeNode(val);
        if(root == null) return node;
        TreeNode cur = root;
        TreeNode pre=root;
        while(cur != null){
            pre = cur;
            if (val < cur.val) cur = cur.left;
            else cur = cur.right;

        }
        if (val > pre.val) pre.right = node;
        else pre.left = node;
        return root;
    }
}
