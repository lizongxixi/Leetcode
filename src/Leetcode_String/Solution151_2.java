package Leetcode_String;

/**
 * @author ZONGXI LI
 * @version 1.0.0
 * @ClassName Solution151_2.java
 * @Description TODO
 * @createTime 2021年11月11日 15:44:00
 */
//输入：s = "the sky is blue"
//输出："blue is sky the"
public class Solution151_2 {
    public String reverseWords(String s) {
        StringBuilder sb = new StringBuilder(s);
        StringBuilder res = new StringBuilder();
        sb.reverse();
        s = sb.toString();
        String[] strings = s.split(" ");
        for (int i = 0; i < strings.length;i++){
            if(strings[i].equals("") == false){
                StringBuilder temp = new StringBuilder(strings[i]);
                res.append(temp.reverse());
                if(i!=strings.length-1){
                    res.append(" ");
                }
            }

        }
        return res.toString();
    }

    public static void main(String[] args) {
        Solution151_2 solution151_2 = new Solution151_2();

        String s = solution151_2.reverseWords("  hello world  ");
        System.out.println(s);
    }
}
