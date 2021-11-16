package Array;

import java.util.ArrayList;

/**
 * @author ZONGXI LI
 * @version 1.0.0
 * @ClassName Solution34.java
 * @Description TODO
 * @createTime 2021年11月01日 11:32:00
 */
public class Solution34 {
    public int[] searchRange(int[] nums, int target) {
        int[] res = {-1,-1};
        int left = 0;
        int right = nums.length-1;
        while(left <= right){
            int mid = left + (right - left)/2;
            if(nums[mid] == target){
                int start = mid;
                int end = mid;
                while(end < nums.length && nums[end] == target) end++;
                end--;
                while(start >= 0 && nums[start] == target) start--;
                start++;
                res[0] = start;
                res[1] = end;
                return res;
            }
            if(nums[mid] > target) right = mid-1;
            else left = mid+1;
        }
        return res;
    }
}
