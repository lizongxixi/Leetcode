package DP;

import java.util.Arrays;

/**
 * @author ZONGXI LI
 * @version 1.0.0
 * @ClassName Solution416.java
 * @Description TODO
 * @createTime 2021年10月13日 16:31:00
 */
public class Solution416 {
    public boolean canPartition(int[] nums) {
        int sum = 0;
        for(int i:nums) sum += i;
        if(sum % 2 == 1) return false;
        sum /= 2;
        //System.out.println(sum);
        int[] dp = new int[sum+1];
        for(int i = 0;i < nums.length;i++){
            for(int j = sum;j >= nums[i];j--){
                dp[j] = Math.max(dp[j],dp[j-nums[i]]+nums[i]);

            }
            System.out.println(Arrays.toString(dp));
        }
        System.out.println(Arrays.toString(dp));
        if(dp[sum] == sum) return true;
        else return false;
        //return true;
    }
    public static void main(String[] args) {
        int[] nums = {1,5,5,11};
        Solution416 solution416 = new Solution416();
        System.out.println(solution416.canPartition(nums));
    }
}
