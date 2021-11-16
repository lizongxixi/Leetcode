package binaryTree;

/**
 * @author ZONGXI LI
 * @version 1.0.0
 * @ClassName TreeNode.java
 * @Description TODO
 * @createTime 2021年11月12日 10:34:00
 */
public class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(){}
    TreeNode(int val){
        this.val = val;
    }
    TreeNode(int val,TreeNode left,TreeNode right){
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
