package HashTable;

import java.util.Arrays;

/**
 * @author ZONGXI LI
 * @version 1.0.0
 * @ClassName Solution242.java
 * @Description TODO
 * @createTime 2021年11月03日 10:27:00
 */
public class Solution242 {
    public boolean isAnagram(String s, String t) {
        String[] str1 = s.split("");
        String[] str2 = t.split("");
        Arrays.sort(str1);
        Arrays.sort(str2);
        s = Arrays.toString(str1);
        t = Arrays.toString(str2);
        return s.equals(t);
    }
    public boolean isAnagram1(String s, String t) {
        int[] nums = new int[26];
        for(int i = 0;i < s.length();i++){
            nums[s.charAt(i)-'a']++;
        }
        for(int i = 0;i < t.length();i++){
            nums[t.charAt(i)-'a']--;
        }
        for (int i : nums){
            if(i != 0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String s = "anagram";
        String t = "nagaram";
        Solution242 solution242 = new Solution242();
        solution242.isAnagram(s,t);
    }
}
