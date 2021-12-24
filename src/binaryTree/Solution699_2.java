package binaryTree;

/**
 * @author ZONGXI LI
 * @version 1.0.0
 * @ClassName Solution699_2.java
 * @Description TODO
 * @createTime 2021年12月23日 22:03:00
 */
public class Solution699_2 {
    //换一个方法，下面的方法还没有完全利用性质
    public TreeNode trimBST(TreeNode root, int low, int high) {
        if (root == null) return null;
        if (root.val < low){
            return trimBST(root.right,low,high);
        }
        if (root.val > low){
            return trimBST(root.left,low,high);
        }
        root.left = trimBST(root.left,low,high);
        root.right = trimBST(root.right,low,high);
        return root;
    }



    //将删除平衡二叉树某一个节点的函数
    private TreeNode deleteNode(TreeNode root,int key){
        if (root == null) return null;
        if (root.val == key){
            if (root.left == null && root.right == null) return null;
            if (root.left == null) return root.right;
            if (root.right == null) return root.left;
            //删除的节点有左右子树,将被删除节点的左子树放在被删除节点的右子树的最左边
            TreeNode cur = root.right;
            while (cur.left != null){
                cur = cur.left;
            }
            cur.left = root.left;
            return root.right;
        }
        if (root.val < key) root.right = deleteNode(root.right,key);
        if (root.val > key) root.left = deleteNode(root.left,key);
        return root;
    }
    //对树进行后序遍历
    public TreeNode trimBST1(TreeNode root, int low, int high) {
        if (root == null) return null;
        root.left = trimBST1(root.left,low,high);
        root.right = trimBST1(root.right,low,high);
        if (root.val<low || root.val > high) root = deleteNode(root,root.val);
        return root;
    }




}
