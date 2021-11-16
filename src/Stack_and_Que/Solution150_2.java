package Stack_and_Que;

import java.util.Stack;

/**
 * @author ZONGXI LI
 * @version 1.0.0
 * @ClassName Solution150_2.java
 * @Description TODO
 * @createTime 2021年11月11日 20:00:00
 */
//输入：tokens = ["2","1","+","3","*"]
//输出：9
//解释：((2 + 1) * 3) = 9
//输入：tokens = ["4","13","5","/","+"]
//输出：6
//解释：(4 + (13 / 5)) = 6
//   ["10","6","9","3","+","-11","*","/","*","17","+","5","+"]
public class Solution150_2 {
    public int evalRPN(String[] tokens) {
        int res = 0;
        Stack<Integer> stack = new Stack<>();
        for (int i = 0;i < tokens.length;i++){
            if(tokens[i].length() == 1 &&(tokens[i].charAt(0) == '+' || tokens[i].charAt(0) == '-' || tokens[i].charAt(0) == '*'|| tokens[i].charAt(0) == '/')){
                int right = stack.pop();
                int left = stack.pop();
                if(tokens[i].equals("+")){
                    res =  left + right;
                }
                else if(tokens[i].equals("-")){
                    res =  left - right;
                }
                else if(tokens[i].equals("*")){
                    res =  left * right;
                }
                else if(tokens[i].equals("/")){
                    res =  left / right;
                }
                stack.push(res);
            }else{
                stack.push(Integer.parseInt(tokens[i]));
            }
        }
        return stack.pop();
    }

    public static void main(String[] args) {
        Solution150_2 solution150_2 = new Solution150_2();
        String[] tokens = {"10","6","9","3","+","-11","*","/","*","17","+","5","+"};
        int res = solution150_2.evalRPN(tokens);
        System.out.println(res);
    }
}
