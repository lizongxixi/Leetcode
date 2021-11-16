package Leetcode_String;

/**
 * @author ZONGXI LI
 * @version 1.0.0
 * @ClassName Solution2122_2.java
 * @Description TODO
 * @createTime 2021年11月11日 15:35:00
 */
//输入：s = "We are happy."
//输出："We%20are%20happy."
public class Solution2122_2 {
    public String replaceSpace(String s) {
        StringBuilder sb = new StringBuilder();
        for(int i = 0;i < s.length();i++){
            if(s.charAt(i) != ' '){
                sb.append(s.charAt(i));
            }else{
                sb.append("%20");
            }
        }
        return sb.toString();
    }
}
