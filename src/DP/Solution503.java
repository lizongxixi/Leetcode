package DP;

import java.util.Arrays;
import java.util.Stack;

/**
 * @author ZONGXI LI
 * @version 1.0.0
 * @ClassName Solution5033.java
 * @Description TODO
 * @createTime 2021年10月20日 19:16:00
 */
public class Solution503 {
    public int[] nextGreaterElements(int[] nums) {
        if(nums.length <= 1) return new int[]{-1};
        int size = nums.length;
        int[] result = new int[size];
        Arrays.fill(result,-1);
        Stack<Integer> st = new Stack<>();
        st.push(0);
        for (int i = 0;i < size*2;i++){
            while(!st.empty() && nums[i%size] > nums[st.peek()]){
                result[st.peek()] = nums[i%size];
                st.pop();
            }
            st.push(i);
        }
        return result;
    }
}
