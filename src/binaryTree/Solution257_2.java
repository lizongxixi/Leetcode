package binaryTree;

import java.util.LinkedList;
import java.util.List;

/**
 * @author ZONGXI LI
 * @version 1.0.0
 * @ClassName Solution257_2.java
 * @Description TODO
 * @createTime 2021年11月14日 10:55:00
 */
public class Solution257_2 {
    List<String> res = new LinkedList<>();
    //路径的记录不能直接用StringBuilder 因为数字可能是多位数，回溯的时候就不好判断应该剪去几个，当然可以使用一个数字记录，但是没必要
    List<Integer> path = new LinkedList<>();
    private void traversal(TreeNode root){
        if(root == null) return;
        path.add(root.val);
        if(root.left == null && root.right == null){
            StringBuilder sb = new StringBuilder();
            for (int i:path){
                sb.append(i+"->");
            }
            sb.delete(sb.length()-2,sb.length());
            res.add(sb.toString());
        }
        traversal(root.left);
        traversal(root.right);
        path.remove(path.size()-1);
    }
    public List<String> binaryTreePaths(TreeNode root) {
        traversal(root);
        return res;
    }
}
