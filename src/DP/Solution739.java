package DP;

import java.util.Arrays;
import java.util.Stack;

/**
 * @author ZONGXI LI
 * @version 1.0.0
 * @ClassName Solution739.java
 * @Description TODO
 * @createTime 2021年10月20日 16:51:00
 */
public class Solution739 {
    public int[] dailyTemperatures(int[] temperatures) {
        int[] result = new int[temperatures.length];
        Stack<Integer> st = new Stack<>();
        st.push(0);
        for(int i = 1;i < temperatures.length;i++){
            if(temperatures[i] <= temperatures[st.peek()]){
                st.push(i);
            }else{
                while(!st.empty() && temperatures[st.peek()] < temperatures[i]){
                    result[st.peek()] = i - st.peek();
                    st.pop();
                }
                st.push(i);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        //[1,1,4,2,1,1,0,0]
        int[] t = {73,74,75,71,69,72,76,73};
        Solution739 solution739 = new Solution739();
        int[] res = solution739.dailyTemperatures(t);
        System.out.println(Arrays.toString(res));
    }
}
