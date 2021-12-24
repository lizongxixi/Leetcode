package binaryTree;

/**
 * @author ZONGXI LI
 * @version 1.0.0
 * @ClassName Solution108_2.java
 * @Description TODO
 * @createTime 2021年12月23日 22:47:00
 */
public class Solution108_2 {
    //区间左闭右闭
    private TreeNode traversal(int[] nums,int low,int high){
        if(low > high) return null;
        int mid = (low+high)/2;
        TreeNode root = new TreeNode(nums[mid]);
        root.left = traversal(nums,low,mid-1);
        root.right = traversal(nums,mid+1,high);
        return root;
    }
    public TreeNode sortedArrayToBST(int[] nums) {
        return traversal(nums,0,nums.length-1);
    }
}
