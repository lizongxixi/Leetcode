package binaryTree;

/**
 * @author ZONGXI LI
 * @version 1.0.0
 * @ClassName Solution222_2.java
 * @Description TODO
 * @createTime 2021年11月13日 18:58:00
 */
public class Solution222_2 {
    //无意义的爆搜
    int num = 0;
    private void traversal(TreeNode root){
        if(root == null) return ;
        num++;
        traversal(root.left);
        traversal(root.right);
    }
    public int countNodes1(TreeNode root) {
        traversal(root);
        return num;
    }
    //利用性质
    public int countNodes(TreeNode root) {
        if(root == null) return 0;
        int leftDepth = 0;
        int rightDepth = 0;
        TreeNode left = root.left;
        TreeNode right = root.right;
        //计算当前节点左子树层高
        while(left != null){
            left = left.left;
            leftDepth++;
        }
        //计算当前节点右子树层高
        while(right != null){
            right = right.right;
            rightDepth++;
        }
        //如果左右子树层高相等，那么以当前节点为根节点的树是满二叉树2<<2 = 2*(2*2) = 8，那么节点数为
        if(rightDepth == leftDepth){
            return (2<<rightDepth) - 1;
        }
        //否则分别计算左右子树的节点数
        return countNodes(root.left) + countNodes(root.right) + 1;
    }
}
