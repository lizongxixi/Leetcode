package binaryTree;

/**
 * @author ZONGXI LI
 * @version 1.0.0
 * @ClassName Solution105_2.java
 * @Description TODO
 * @createTime 2021年12月16日 20:07:00
 */
//采用左闭右闭区间
public class Solution105_2 {
    private TreeNode traversal(int[] preorder,int preBegin,int preEnd,int[] inorder,int inBegin,int inEnd){
        if(preBegin > preEnd) return null;
        TreeNode root = new TreeNode(preorder[preBegin]);
        //寻找分割点
        int split;
        for(split = inBegin;split <= inEnd;split++){
            if(inorder[split] == preorder[preBegin]) break;
        }
        //分割中序数组，分成左中序，和右中序两个部分
        int lInBegin = inBegin;
        int lInEnd = split-1;
        int rInBegin = split+1;
        int rInEnd = inEnd;
        //分割前序数组，同样分成左前序，和右前序，长度与中序数组对应
        int lPreBegin = preBegin+1;
        int lPreEnd = lPreBegin+(lInEnd-lInBegin);
        int rPreBegin = lPreEnd+1;
        int rPreEnd = preEnd;
        root.left = traversal(preorder,lPreBegin,lPreEnd,inorder,lInBegin,lInEnd);
        root.right = traversal(preorder,rPreBegin,rPreEnd,inorder,rInBegin,rInEnd);
        return root;
    }
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        if(preorder.length == 0 || inorder.length == 0){
            return null;
        }
        return traversal(preorder,0,preorder.length-1,inorder,0,inorder.length-1);
    }
}
