package Array;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * @author ZONGXI LI
 * @version 1.0.0
 * @ClassName Solution209.java
 * @Description TODO
 * @createTime 2021年11月01日 21:56:00
 */
public class Solution209 {
    public static int minSubArrayLen(int target, int[] nums) {
        int sum = 0;
        int startW = 0;
        int res = Integer.MAX_VALUE;
        for(int i = 0;i < nums.length;i++){
            sum += nums[i];
            while(sum >= target){
                int len = i - startW + 1;
                res = res < len ? res:len;
                //更新滑动窗口
                sum -= nums[startW++];
            }
        }
        return  res == Integer.MAX_VALUE? 0 : res;
    }

    public static void main(String[] args) {
        Solution209 solution209 = new Solution209();
        int[] ints = {10,2,3};
        int n = Solution209.minSubArrayLen(10,ints);
        System.out.println(n);
    }
}
