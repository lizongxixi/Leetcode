package Greedy;

/**
 * @author ZONGXI LI
 * @version 1.0.0
 * @ClassName Solution122_2.java
 * @Description TODO
 * @createTime 2022年01月09日 17:24:00
 */
public class Solution122_2 {
    //可以当天卖出的同时，当天买入，算差价即可
    public int maxProfit1(int[] prices) {
        int res = 0;
        for (int i = 1;i < prices.length;i++){
            int diff = prices[i] - prices[i-1];
            if(diff > 0) res += diff;
        }
        return res;
    }
    //模拟交易
    public int maxProfit(int[] prices) {
        int res = 0;
        int[][] dp = new int[prices.length][3];
        dp[0][0] = -prices[0];
        for(int i = 1;i < prices.length;i++){
            dp[i][0]=Math.max(dp[i-1][0],dp[i-1][1]-prices[i]);
            dp[i][1]=Math.max(dp[i-1][1],dp[i-1][0]+prices[i]);
        }
        return Math.max(dp[prices.length-1][0],dp[prices.length-1][1]);
    }
}
