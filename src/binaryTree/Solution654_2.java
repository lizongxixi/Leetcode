package binaryTree;

/**
 * @author ZONGXI LI
 * @version 1.0.0
 * @ClassName Solution654_2.java
 * @Description TODO
 * @createTime 2021年12月17日 15:41:00
 */
//采用左闭右闭将数组划分
public class Solution654_2 {
    private TreeNode traversal(int[] nums, int begin, int end){
        if (begin > end) return null;
        // 先找到当前的最大值及其下标
        int maxValue = nums[begin];
        int split = begin;
        for(int i = begin;i <= end;i++ ){
            if(nums[i] > maxValue){
                maxValue = nums[i];
                split = i;
            }
        }
        //分割当前数组为左数组和右数组
        int lBegin = begin;
        int lEnd = split-1;
        int rBegin = split+1;
        int rEnd = end;
        //为当前树的根节点
        TreeNode root = new TreeNode(maxValue);
        root.left = traversal(nums,lBegin,lEnd);
        root.right = traversal(nums,rBegin,rEnd);
        return root;
    }
    public TreeNode constructMaximumBinaryTree(int[] nums) {
        if (nums.length == 0) return null;
        return traversal(nums,0,nums.length-1);
    }
}
