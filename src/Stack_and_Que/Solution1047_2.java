package Stack_and_Que;

/**
 * @author ZONGXI LI
 * @version 1.0.0
 * @ClassName Solution1047.java
 * @Description TODO
 * @createTime 2021年11月11日 19:41:00
 */
//输入："abbaca"
//输出："ca"
public class Solution1047_2 {
    public String removeDuplicates(String s) {
        String[] strings = s.split("");
        StringBuilder sb = new StringBuilder();
        for (String str:strings){
                if(sb.length()!=0 && sb.charAt(sb.length()-1) == str.charAt(0)){
                    sb.deleteCharAt(sb.length()-1);
                }else{
                    sb.append(str);
                }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        Solution1047_2 solution1047 = new Solution1047_2();
        String s = solution1047.removeDuplicates("abbaca");
        System.out.println(s);
    }
}
