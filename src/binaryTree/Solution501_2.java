package binaryTree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @author ZONGXI LI
 * @version 1.0.0
 * @ClassName Solution501_2.java
 * @Description TODO
 * @createTime 2021年12月19日 18:34:00
 */
public class Solution501_2 {
    int maxNum = 0;
    int nowNum = 0;
    private TreeNode pre;
    private ArrayList<Integer> res = new ArrayList<>();
    private void traversal(TreeNode root){
        if(root == null) return;
        traversal(root.left);
        if(pre == null){
            nowNum = 1;
        }else if (pre.val == root.val){
            nowNum++;
        }else if (pre.val != root.val){
            nowNum = 1;
        }
        pre = root;
        if (nowNum == maxNum){
            res.add(root.val);
        }
        if (nowNum > maxNum){
            maxNum = nowNum;
            res.clear();
            res.add(root.val);
        }
        traversal(root.right);
    }
    public int[] findMode(TreeNode root) {
        traversal(root);
        int[] result = new int[res.size()];
        for(int i = 0;i < result.length;i++){
            result[i]=res.get(i);
        }
        return result;
    }
}
