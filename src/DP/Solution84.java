package DP;

import java.util.Arrays;

/**
 * @author ZONGXI LI
 * @version 1.0.0
 * @ClassName Solution84.java
 * @Description TODO
 * @createTime 2021年10月21日 23:13:00
 */
public class Solution84 {
    public int largestRectangleArea(int[] heights) {
        int length = heights.length;
        int[] minLeftIndex = new int [length];
        int[] minRigthIndex = new int [length];
        // 记录左边第一个小于该柱子的下标
        minLeftIndex[0] = -1 ;
        for (int i = 1; i < length; i++) {
            int t = i - 1;
            // 这里不是用if，而是不断向右寻找的过程
            while (t >= 0 && heights[t] >= heights[i]) t = minLeftIndex[t];
            minLeftIndex[i] = t;
        }
        System.out.println(Arrays.toString(minLeftIndex));
        // 记录每个柱子 右边第一个小于该柱子的下标
        minRigthIndex[length - 1] = length;
        for (int i = length - 2; i >= 0; i--) {
            int t = i + 1;
            while(t < length && heights[t] >= heights[i]) t = minRigthIndex[t];
            minRigthIndex[i] = t;
        }
        System.out.println(Arrays.toString(minRigthIndex));
        // 求和
        int result = 0;
        for (int i = 0; i < length; i++) {
            int sum = heights[i] * (minRigthIndex[i] - minLeftIndex[i] - 1);
            result = Math.max(sum, result);
        }
        return result;
    }

    public static void main(String[] args) {
        Solution84 solution84 = new Solution84();
        int[] h = {2,1,5,6,2,3};
        int n = solution84.largestRectangleArea(h);

    }
}
