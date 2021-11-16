package binaryTree;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * @author ZONGXI LI
 * @version 1.0.0
 * @ClassName Solution113_2.java
 * @Description TODO
 * @createTime 2021年11月14日 18:12:00
 */
public class Solution113_2 {
    private LinkedList<Integer> path = new LinkedList<>();
    private List<List<Integer>> res = new LinkedList<>();
    private int sum = 0;
    private void traversal(TreeNode root,int target){
        if(root != null){
            sum += root.val;
            path.add(root.val);
        }
        if(root == null) return;
        if(root.right == null && root.left == null && sum==target){
            //System.out.println(Arrays.toString(path.toArray()));
            res.add(new LinkedList<>(path));
        }
        traversal(root.left,target);
        traversal(root.right,target);
        sum -= root.val;
        path.remove(path.size()-1);
    }
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        traversal(root,targetSum);
        return res;
    }
}
