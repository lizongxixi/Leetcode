package Leetcode_String;

/**
 * @author ZONGXI LI
 * @version 1.0.0
 * @ClassName Solution344.java
 * @Description TODO
 * @createTime 2021年11月11日 15:19:00
 */

//输入：s = ["h","e","l","l","o"]
//输出：["o","l","l","e","h"]
public class Solution344_2 {
    public void reverseString(char[] s) {
        int left = 0;
        int right = s.length-1;
        while(left < right){
            char temp = s[left];
            s[left] = s[right];
            s[right] = temp;
            left++;
            right--;
        }
    }
}
