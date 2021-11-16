package Stack_and_Que;

import java.util.Stack;

/**
 * @author ZONGXI LI
 * @version 1.0.0
 * @ClassName Solution20_2.java
 * @Description TODO
 * @createTime 2021年11月11日 19:25:00
 */
//输入：s = "([)]"
//输出：false
public class Solution20_2 {
    public boolean isValid(String s) {
        String[] strings = s.split("");
        Stack<String> stack = new Stack<>();
        for(String str:strings){
            if(str.equals("[") || str.equals("(") ||str.equals("{")){
                stack.push(str);
            }else{
                if(stack.empty()) return false;
                if(str.equals("]")){
                    if(!stack.pop().equals("[")) return false;
                }
                if(str.equals(")")){
                    if(!stack.pop().equals("(")) return false;
                }
                if(str.equals("}")){
                    if(!stack.pop().equals("{")) return false;
                }
            }
        }
        if(stack.empty()) return true;
        return false;
    }
}
