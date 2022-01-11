package Greedy;
import java.util.Arrays;

/**
 * @author ZONGXI LI
 * @version 1.0.0
 * @ClassName Solution1005_2.java
 * @Description TODO
 * @createTime 2022年01月10日 08:47:00
 */
public class Solution1005_2 {
    public int largestSumAfterKNegations(int[] nums, int k) {
        Integer res=0;
        Integer[] integers = new Integer[nums.length];
        for (int i = 0;i<nums.length;i++){
            integers[i] = nums[i];
        }
        //按照绝对值降序
        Arrays.sort(integers,(o1,o2)->{
            return Math.abs((Integer) o2)-Math.abs((Integer) o1);
        });
        for(int i = 0;i < integers.length;i++){
            if(k > 0 && integers[i] < 0){
                k--;
                integers[i] = -integers[i];
            }
        }
        if(k > 0 && k%2 ==1){
            integers[integers.length-1] = -integers[integers.length-1];
        }
        for (Integer i:integers){
            res+=i;
        }
        return res;
    }
}
