package DP;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Stack;

/**
 * @author ZONGXI LI
 * @version 1.0.0
 * @ClassName Solution496.java
 * @Description TODO
 * @createTime 2021年10月20日 18:37:00
 */
public class Solution496 {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] result = new int[nums1.length];
        Arrays.fill(result,-1);
        HashMap<Integer,Integer> hashMap = new HashMap<>();
        for (int i = 0;i < nums1.length;i++){
            hashMap.put(nums1[i],i);
        }
        Stack<Integer> st = new Stack<>();
        st.push(0);
        for (int i = 0;i < nums2.length;i++){
            if (nums2[i] <= nums2[st.peek()]){
                st.push(i);
            }else {
                while (!st.empty() && nums2[i] > nums2[st.peek()]){
                    if(hashMap.containsKey(nums2[st.peek()])){
                        result[hashMap.get(nums2[st.peek()])] = nums2[i];
                    }
                    st.pop();
                }
                st.push(i);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        //输入: nums1 = [4,1,2], nums2 = [1,3,4,2].
        //输出: [-1,3,-1]
    }
}
