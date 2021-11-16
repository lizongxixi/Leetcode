package Array;

/**
 * @author ZONGXI LI
 * @version 1.0.0
 * @ClassName Solution35.java
 * @Description 搜索插入位置
 * @createTime 2021年11月01日 11:11:00
 */
public class Solution35 {
    public int searchInsert(int[] nums, int target) {
        int left = 0;
        int right = nums.length-1;
        while(left <= right){
            int mid = left + (right - left)/2;
            if(nums[mid] == target){
                return mid;
            }
            if(nums[mid] > target) right = mid-1;
            else left = mid+1;
        }
        return left;
    }
}
