package Greedy;

/**
 * @author ZONGXI LI
 * @version 1.0.0
 * @ClassName Solution53_2.java
 * @Description TODO
 * @createTime 2022年01月09日 16:40:00
 */
public class Solution53_2 {
    public int maxSubArray1(int[] nums) {
        int res = nums[0];
        int now = nums[0];
        for(int i = 1;i < nums.length;i++){
            now += nums[i];
            //判断加还是不加，感觉类似dp
            if(now < nums[i]) now = nums[i];
            if(now > res) res = now;
        }
        return res;
    }
    //dp
    public int maxSubArray(int[] nums) {
        int[] dp = new int[nums.length];
        dp[0] = nums[0];
        int res = nums[0];
        for(int i = 1;i < nums.length;i++){
            dp[i] = Math.max(nums[i],dp[i-1]+nums[i]);
            if(dp[i]>res)res = dp[i];
            //System.out.println(Arrays.toString(dp));
        }
        return res;
    }
}
