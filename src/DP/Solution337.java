package DP;

import javax.swing.tree.TreeNode;
import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;

/**
 * @author ZONGXI LI
 * @version 1.0.0
 * @ClassName Solution337.java
 * @Description TODO
 * @createTime 2021年10月17日 08:54:00
 */
class TreeNode1{
  int val;
  TreeNode1 left;
  TreeNode1 right;
  TreeNode1() {}
  TreeNode1(int val) { this.val = val; }
  TreeNode1(int val, TreeNode1 left, TreeNode1 right) {
      this.val = val;
      this.left = left;
      this.right = right;
  }
}

class Solution337 {
    ArrayList<Integer> numA = new ArrayList<>();
    private void traversal(TreeNode1 root){
        Deque<TreeNode1> deque = new LinkedList<>();
        deque.addLast(root);
        numA.add(root.val);
        while(!deque.isEmpty()){
            int size = deque.size();
            int sum = 0;
            for (int i = 0;i < size;i++){
                TreeNode1 cur = deque.removeFirst();
                sum += cur.val;
                if(cur.left != null) deque.push( cur.left);
                if(cur.right != null) deque.push(cur.right);
            }
            numA.add(sum);
        }
    }
    public int rob(TreeNode1 root) {
        if(root == null) return 0;
        traversal(root);
        if(numA.size() == 1) return numA.get(0);
        int[] nums = new int[numA.size()];
        int[] dp = new int[nums.length];
        for(int i = 0;i < nums.length;i++){
            nums[i] = numA.get(i);
        }
        dp[0] = nums[0];
        dp[1] = Math.max(nums[0],nums[1]);
        for(int i = 2;i < nums.length;i++){
            dp[i] = Math.max(dp[i-1],dp[i-2]+nums[i]);
        }
        return dp[dp.length-1];
    }
}
