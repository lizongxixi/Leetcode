package Greedy;

/**
 * @author ZONGXI LI
 * @version 1.0.0
 * @ClassName Solution376_2.java
 * @Description TODO
 * @createTime 2022年01月05日 12:31:00
 */
public class Solution376_2 {
    public int wiggleMaxLength1(int[] nums) {
        if(nums.length <= 1) return nums.length;
        int res = 1;
        int preDiff = 0;
        int curDiff = 0;
        for(int i = 0;i < nums.length-1;i++){
            curDiff = nums[i+1] - nums[i];
            if(preDiff >=0 && curDiff <0||preDiff<=0 && curDiff>0){
                res++;
                preDiff = curDiff;
            }
        }
        return res;
    }

    //DP
    public int wiggleMaxLength(int[] nums) {
       int[][] dp = new int[nums.length][2];
       for(int i = 0;i < nums.length;i++){
           dp[i][0] = dp[i][1] = 1;
           for(int j = 0;j < i;j++){
               //dp[i][1]、nums[i]>nums[j]，表示i处为山峰，接在山谷后面
               if(nums[i] > nums[j]){
                   dp[i][1] = Math.max(dp[i][1],dp[i][0]+1);
               }
               if(nums[i] < nums[j]){
                   dp[i][0] = Math.max(dp[i][0],dp[i][1]+1);
               }
           }
       }
       return Math.max(dp[nums.length-1][0],dp[nums.length-1][1]);
    }
}
