package Greedy;

/**
 * @author ZONGXI LI
 * @version 1.0.0
 * @ClassName Solution55_2.java
 * @Description TODO
 * @createTime 2022年01月09日 21:02:00
 */
public class Solution55_2 {
    public boolean canJump(int[] nums) {
        int cover = nums[0];
        for(int i = 0;i <= cover;i++){
            if(i+nums[i] > cover){
                cover = i+nums[i];
            }
            if (cover >= nums.length-1) return true;
        }
        return false;
    }
}
