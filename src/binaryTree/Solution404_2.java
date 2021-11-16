package binaryTree;

/**
 * @author ZONGXI LI
 * @version 1.0.0
 * @ClassName Solution404_2.java
 * @Description TODO
 * @createTime 2021年11月14日 12:19:00
 */
public class Solution404_2 {
    int res = 0;
    private void traversal(TreeNode root){
        if(root == null) return;
        //模拟左叶子树形结构
        if(root.left!=null && root.left.left == null && root.left.right == null){
            res += root.left.val;
        }
        traversal(root.left);
        traversal(root.right);
    }
    public int sumOfLeftLeaves(TreeNode root) {
        traversal(root);
        return res;
    }

    //层序遍历太简单就不写了吧
}
