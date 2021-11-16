package DP;

import java.util.Arrays;

/**
 * @author ZONGXI LI
 * @version 1.0.0
 * @ClassName Solution647.java
 * @Description TODO
 * @createTime 2021年10月19日 19:24:00
 */
public class Solution647 {
    private boolean isPalindrome(String s,int start,int end){
        for(int i = start,j = end;i < j;i++,j--){
            if(s.charAt(i) != s.charAt(j)) return false;
        }
        return true;
    }
    public int countSubstrings(String s) {
        if(s.length() == 1) return 1;
       // int[] dp = new int[s.length()+1];
        //Arrays.fill(dp,s.length());
        int res = s.length();
        //System.out.println("test: "+isPalindrome(s,0,2));
        for(int i = 2;i <= s.length();i++){
            for(int j = 1;j < i;j++){
                if(isPalindrome(s,j-1,i-1)){
                    //dp[i] = Math.max(dp[i-1],dp[i])+1;
                    // System.out.println("i: "+i+"  j: "+j);
                    //System.out.println(Arrays.toString(dp));
                    res++;
                }//else dp[i] = dp[i-1];
                //if(dp[i] > res) res = dp[i];
            }
           // System.out.println(Arrays.toString(dp));
        }
        //System.out.println(Arrays.toString(dp));
        return res;
    }

    public static void main(String[] args) {
        // "lcubxppcmlirhummr" 19   "ab" 2  "xkjkqlajprjwefilxgpdpebieswu" 30   "aaa" 6
        String s1 = "ab";
        //String s2 = "abc";
        Solution647 solution647 = new Solution647();
        int n = solution647.countSubstrings(s1);
        System.out.println(n);
    }
}
