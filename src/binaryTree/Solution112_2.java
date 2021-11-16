package binaryTree;

/**
 * @author ZONGXI LI
 * @version 1.0.0
 * @ClassName Solution112_2.java
 * @Description TODO
 * @createTime 2021年11月14日 17:47:00
 */
public class Solution112_2 {
    boolean res = false;
    int now = 0;
    private void traversal(TreeNode root,int targetSum){
        if(root != null){
            now += root.val;
        }
        if(root == null){
            return;
        }
        //叶子节点，比较路径和与目标和
        if(root.left == null && root.right == null){
            if(now == targetSum) res = true;
        }
        traversal(root.left,targetSum);
        traversal(root.right,targetSum);
        //回溯
        now -= root.val;
    }
    public boolean hasPathSum(TreeNode root, int targetSum) {
        traversal(root,targetSum);
        return res;
    }
}
