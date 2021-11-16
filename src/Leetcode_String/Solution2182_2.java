package Leetcode_String;

/**
 * @author ZONGXI LI
 * @version 1.0.0
 * @ClassName Solution2182.java
 * @Description TODO
 * @createTime 2021年11月11日 16:24:00
 */
public class Solution2182_2 {
    public String reverseLeftWords(String s, int n) {
        StringBuilder res = new StringBuilder();
        StringBuilder left = new StringBuilder();
        for(int i = 0;i < s.length();i++){
            if(i < n){
                left.append(s.charAt(i));
            }else{
                res.append(s.charAt(i));
            }
        }
        res.append(left);
        return res.toString();
    }
}
