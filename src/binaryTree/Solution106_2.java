package binaryTree;

/**
 * @author ZONGXI LI
 * @version 1.0.0
 * @ClassName Solution106_2.java
 * @Description TODO
 * @createTime 2021年12月16日 18:45:00
 */
//左闭右闭
public class Solution106_2 {
    private TreeNode traversal(int[] inorder,int inLeft,int inRight, int[] postorder,int pLeft,int pRight){
        if(pLeft > pRight){
            return null;
        }
        TreeNode root= new TreeNode(postorder[pRight]);
        int split;
        for(split = inLeft;split <= inRight;split++){
            if(inorder[split] == postorder[pRight]){
                break;
            }
        }
        int leftInOrderBegin = inLeft;
        int leftInOrderEnd = split-1;
        int rightInOrderBegin = split+1;
        int rightInOrderEnd = inRight;

        //切割后序数组
        //注意这里用到了前序数组和后序数组的长度一致性
        int leftPostOrderBegin = pLeft;
        int leftPostOrderEnd = pLeft+(leftInOrderEnd - leftInOrderBegin);
        int rightPostOrderBegin = leftPostOrderEnd+1;
        int rightPostOrderEnd = pRight-1;

        root.left = traversal(inorder,leftInOrderBegin,leftInOrderEnd,postorder,leftPostOrderBegin,leftPostOrderEnd);
        root.right = traversal(inorder,rightInOrderBegin,rightInOrderEnd,postorder,rightPostOrderBegin,rightPostOrderEnd);
        return root;
    }
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        if (inorder.length == 0 || postorder.length == 0) return null;
        return traversal(inorder,0,inorder.length-1,postorder,0,postorder.length-1);
    }
}
