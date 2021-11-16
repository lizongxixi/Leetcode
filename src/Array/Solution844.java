package Array;

/**
 * @author ZONGXI LI
 * @version 1.0.0
 * @ClassName Solution884.java
 * @Description TODO
 * @createTime 2021年11月01日 20:39:00
 */
//        输入：s = "ab#c", t = "ad#c" 输出：true 解释：S 和 T 都会变成 “ac”。
//        输入：s = "ab##", t = "c#d#" 输出：true 解释：s 和 t 都会变成 “”。
//        输入：s = "a##c", t = "#a#c" 输出：true 解释：s 和 t 都会变成 “c”。
public class Solution844 {
    public boolean backspaceCompare(String s, String t) {
        return Build(s).equals(Build(t));
    }
    private String Build(String str){
        StringBuilder sb = new StringBuilder();
        for(int i = 0;i < str.length();i++){
            if(str.charAt(i) != '#') sb.append(str.charAt(i));
            else{
                if(sb.length() > 0){
                    sb.deleteCharAt(sb.length()-1);
                }
            }
        }
        return sb.toString();
    }
}
