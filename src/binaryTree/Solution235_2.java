package binaryTree;

/**
 * @author ZONGXI LI
 * @version 1.0.0
 * @ClassName Solution235_2.java
 * @Description TODO
 * @createTime 2021年12月19日 19:18:00
 */
public class Solution235_2 {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        TreeNode cur = root;
        TreeNode temp;
        //确保p是左边的节点
        if(p.val > q.val){
            temp = p;
            p = q;
            q = temp;
        }
        while(true){
            if (cur.val >= p.val && cur.val <= q.val) return cur;
            if (cur.val < p.val) cur = cur.right;
            if (cur.val > q.val) cur = cur.left;
        }
    }
}
