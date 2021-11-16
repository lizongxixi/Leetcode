package binaryTree;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

/**
 * @author ZONGXI LI
 * @version 1.0.0
 * @ClassName Solution145_2.java
 * @Description TODO
 * @createTime 2021年11月12日 11:07:00
 */
public class Solution145_2 {
    //递归
    List<Integer> ans = new LinkedList<>();
    private void traversal(TreeNode root){
        if(root == null) return;
        traversal(root.left);
        traversal(root.right);
        ans.add(root.val);
    }
    public List<Integer> postorderTraversal(TreeNode root) {
        traversal(root);
        return ans;
    }
    //迭代
    public List<Integer> postorderTraversal1(TreeNode root) {
        List<Integer> res = new LinkedList<>();
        if(root == null){
            return res;
        }
        Stack<TreeNode> stack = new Stack<>();
        stack.add(root);
        while(!stack.empty()){
            TreeNode cur = stack.pop();
            if(cur != null){
                stack.push(cur);
                stack.push(null);
                if(cur.right != null) stack.push(cur.right);
                if(cur.left != null) stack.push(cur.left);

            }else{
                TreeNode node = stack.pop();
                res.add(node.val);
            }
        }
        return res;
    }
}
