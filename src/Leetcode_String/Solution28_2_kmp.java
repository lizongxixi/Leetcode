package Leetcode_String;

/**
 * @author ZONGXI LI
 * @version 1.0.0
 * @ClassName Solution28_2_kmp.java
 * @Description TODO
 * @createTime 2021年11月11日 16:54:00
 */
public class Solution28_2_kmp {
    private int[] getNext(String s){
        int[] next = new int[s.length()];
        int j = 0;
        for(int i = 1;i < s.length();i++){
            while(j > 0 && s.charAt(i) != s.charAt(j)){
                j = next[j-1];
            }
            if(s.charAt(i) == s.charAt(j)){
                j++;
            }
            next[i] = j;
        }
        return next;
    }
    public int strStr(String haystack, String needle) {
        if(needle.length() == 0) return 0;
        int[] next = getNext(needle);
        int j = 0;
        for (int i = 0;i < haystack.length();i++){
            while(j > 0 && haystack.charAt(i) != needle.charAt(j)){
                j = next[j-1];
            }
            if(haystack.charAt(i) == needle.charAt(j)){
                j++;
            }
            if(j == needle.length()){
                return i-needle.length()+1;
            }
        }
        return -1;
    }
}
