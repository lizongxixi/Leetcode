package Leetcode_String;

import java.util.Arrays;

/**
 * @author ZONGXI LI
 * @version 1.0.0
 * @ClassName Solution459_2_kmp.java
 * @Description TODO
 * @createTime 2021年11月11日 17:19:00
 */
public class Solution459_2_kmp {
    private int[] getNext(String s){
        int[] next = new int[s.length()];
        int j = 0;
        for(int i = 1;i < s.length();i++){
            while(j > 0 && s.charAt(i) != s.charAt(j)){
                j = next[j-1];
            }
            if(s.charAt(i) == s.charAt(j)) j++;
            next[i] = j;
        }
        return next;
    }
    public boolean repeatedSubstringPattern(String s) {
        int[] next = getNext(s);
        int size = next.length - next[next.length-1];
        //System.out.println(Arrays.toString(next));
        if(next.length % size == 0 && next[next.length-1]!=0) return true;
        return false;
    }
//"aabaaba" "abab" "abcabcabcabc" "aba"
    public static void main(String[] args) {
        Solution459_2_kmp solution459_2_kmp = new Solution459_2_kmp();
        System.out.println(solution459_2_kmp.repeatedSubstringPattern("a"));
    }
}
