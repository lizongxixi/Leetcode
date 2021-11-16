package binaryTree;

import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

/**
 * @author ZONGXI LI
 * @version 1.0.0
 * @ClassName Solution94_2.java
 * @Description TODO
 * @createTime 2021年11月12日 11:57:00
 */
public class Solution94_2 {
    List<Integer> ans = new LinkedList<>();
    private void traversal(TreeNode root){
        if(root == null) return;
        traversal(root.left);
        ans.add(root.val);
        traversal(root.right);
    }
    public List<Integer> inorderTraversal(TreeNode root) {
        traversal(root);
        return ans;
    }

    public List<Integer> inorderTraversal1(TreeNode root) {
        List<Integer> res = new LinkedList<>();
        if(root == null) return res;
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);
        while(!stack.empty()){
            TreeNode cur = stack.pop();
            if(cur != null){
                if(cur.right != null) stack.push(cur.right);
                stack.push(cur);
                stack.push(null);
                if(cur.left != null) stack.push(cur.left);
            }
            else{
                TreeNode node = stack.pop();
                res.add(node.val);
            }
        }
        return res;
    }
}
