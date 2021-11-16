package HashTable;

import java.util.*;

/**
 * @author ZONGXI LI
 * @version 1.0.0
 * @ClassName Solution15.java
 * @Description TODO
 * @createTime 2021年11月10日 14:36:00
 */
//输入：nums = [-1,0,1,2,-1,-4]
//输出：[[-1,-1,2],[-1,0,1]]
public class Solution15_2 {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res = new LinkedList<>();
        Arrays.sort(nums);
        for (int i = 0; i < nums.length;i++){
            if(nums[i] > 0){
                return res;
            }
            if(i > 0 && nums[i] == nums[i-1]) continue;
            int left = i+1;
            int right = nums.length-1;
            while(left < right){
                if(nums[i] + nums[left] + nums[right] < 0) left++;
                else if(nums[i] + nums[left] + nums[right] > 0) right++;
                else{
                    res.add(Arrays.asList(nums[i],nums[left],nums[right]));
                    while(left < right && nums[right] == nums[right-1]) right--;
                    while(left < right && nums[left] == nums[left+1]) left++;
                    right--;
                    left++;
                }
            }
        }
        return res;
    }
}
