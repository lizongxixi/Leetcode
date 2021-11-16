package binaryTree;

import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

/**
 * @author ZONGXI LI
 * @version 1.0.0
 * @ClassName Solution144_2.java
 * @Description TODO
 * @createTime 2021年11月12日 10:37:00
 */
public class Solution144_2 {
    List<Integer> ans = new LinkedList<>();
    //递归前序
    private void traversal(TreeNode root){
        if(root == null) return;
        ans.add(root.val);
        traversal(root.left);
        traversal(root.right);
    }
    public List<Integer> preorderTraversal(TreeNode root) {
        traversal(root);
        return ans;
    }
    //迭代
    public List<Integer> preorderTraversal1(TreeNode root) {
        List<Integer> res = new LinkedList<>();
        if(root == null) return res;
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);
        while(!stack.empty()){
            TreeNode cur = stack.pop();
            if(cur!=null){
                if(cur.right != null) stack.push(cur.right);
                if(cur.left != null) stack.push(cur.left);
                stack.push(cur);
                stack.push(null);
            }else{
                //stack.pop();
                TreeNode node = stack.pop();
                res.add(node.val);
            }
        }
        return res;
    }
}
