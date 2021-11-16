package DP;

import java.util.Arrays;
import java.util.Stack;

/**
 * @author ZONGXI LI
 * @version 1.0.0
 * @ClassName Solution516.java
 * @Description TODO
 * @createTime 2021年10月19日 23:58:00
 */
public class Solution516 {
    public int longestPalindromeSubseq(String s) {
        if(s.length() == 1) return 1;
        int[][] dp = new int[s.length()][s.length()];
        for(int i = 0;i < s.length();i++) dp[i][i] = 1;
        for(int i = s.length()-1;i >= 0;i--){
            for(int j = i+1;j < s.length();j++){
                if(s.charAt(i) == s.charAt(j)){
                    dp[i][j] = dp[i+1][j-1]+2;


                }else{
                    dp[i][j] = Math.max(dp[i+1][j],dp[i][j-1]);
                }
            }
        }
        for(int[] d:dp)
        System.out.println(Arrays.toString(d));
        return dp[0][s.length()-1];
    }

    public static void main(String[] args) {
        //cbdd 2 "aabaa"5  bbbab4
        Solution516 solution516 = new Solution516();
        String s = "bbbab";

        int n = solution516.longestPalindromeSubseq(s);
        System.out.println(n);
        Stack<Integer> T = new Stack<>();
    }
}
