package binaryTree;

/**
 * @author ZONGXI LI
 * @version 1.0.0
 * @ClassName Solution450_2.java
 * @Description TODO
 * @createTime 2021年12月23日 20:23:00
 */
public class Solution450_2 {
    //递归
    public TreeNode deleteNode(TreeNode root, int key) {
        if(root == null) return null;
        if (root.val == key){
            if (root.left == null && root.right == null) {
                return null;
            }
            if (root.left == null){
                return root.right;
            }
            if (root.right == null){
                return root.left;
            }
            //被删除节点左右节点均不为空的情况
            TreeNode cur = root;
            cur = cur.right;
            while(cur.left!=null){
                cur = cur.left;
            }
            cur.left = root.left;
            return root.right;
        }
        if (root.val < key){
            root.right = deleteNode(root.right,key);
        }
        if (root.val > key){
            root.left = deleteNode(root.left,key);
        }
        return root;
    }
    //自己写的迭代法，代码冗余
    public TreeNode deleteNode1(TreeNode root, int key) {
        if (root == null){
            return null;
        }
        //用来遍历
        TreeNode cur = root;
        //记录cur的上一个节点
        TreeNode pre = null;
        while(cur!=null){
            // 根节点是key
            if(root.val == key){
                if(cur.left==null && cur.right==null) return null;
                else if(cur.left==null && cur.right!=null) return cur.right;
                else if(cur.left!=null && cur.right==null) return cur.left;
                else if(cur.left!=null && cur.right!=null){
                    cur = cur.right;
                    while(cur.left!=null){
                        cur = cur.left;
                    }
                    cur.left = root.left;
                    return root.right;
                }
            }
            //非根节点是key

            if(cur.val > key){
                pre = cur;
                cur = cur.left;
            }
            else if(cur.val < key){
                pre = cur;
                cur = cur.right;
            }
            else if (cur.val == key){
                //叶子节点
                if (cur.left == null && cur.right == null){
                    if(pre.right == cur) pre.right = null;
                    if (pre.left == cur) pre.left = null;
                    return root;
                }
                //当前节点左边为空
                if (cur.left == null && cur.right != null){
                    if(pre.right == cur) pre.right = cur.right;
                    if (pre.left == cur) pre.left = cur.right;
                    return root;
                }
                //当前节点的右节点为空
                if (cur.left != null && cur.right == null){
                    if (pre.right == cur) pre.right = cur.left;
                    if (pre.left == cur) pre.left = cur.left;
                    return root;
                }
                if (cur.left != null && cur.right != null){
                    //当前节点的左右节点不为空，那么将当前节点的左节点放在当前右节点的最左边
                    if (pre.right == cur){
                        cur = cur.right;
                        while(cur.left!=null){
                            cur = cur.left;
                        }
                        cur.left = pre.right.left;
                        pre.right = pre.right.right;
                        return root;
                    }
                    if (pre.left == cur){
                        cur = cur.right;
                        while(cur.left!=null){
                            cur = cur.left;
                        }
                        cur.left = pre.left.left;
                        pre.left = pre.left.right;
                        return root;
                    }
                }
            }
        }
        return root;
    }
}
