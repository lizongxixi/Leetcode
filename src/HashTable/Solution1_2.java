package HashTable;

import java.util.*;


/**
 * @author ZONGXI LI
 * @version 1.0.0
 * @ClassName Solution1_2.java
 * @Description TODO
 * @createTime 2021年11月04日 12:39:00
 */
public class Solution1_2 {
    public int[] twoSum(int[] nums, int target) {
        int[] res = new int[2];
        for (int i = 0;i < nums.length;i++){
            for (int j = i+1;j < nums.length;j++){
                if(nums[i] + nums[j] == target){
                    res[0] = i;
                    res[1] = j;
                    break;
                }
            }
        }
        return res;
    }
    //使用Map不一定是先将key、value先加入map，可以是边用边加
    public int[] twoSum1(int[] nums, int target) {
        int[] res = new int[2];
        //key为数值 value为下标
        //由于只是两数之和，如果是两个重复的数，那么第一个数会加入到map中
        // 当第二个重复的数出现时，如果正好是target，那么则为结果，否则，重复值我们只需要记录一个即可
        Map<Integer,Integer> map = new HashMap<>();
        for (int i = 0;i < nums.length;i++){
            if(map.containsKey(target - nums[i])){
                res[0] = i;
                res[1] = map.get(target - nums[i]);
            }else{
                map.put(nums[i],i);
            }
        }
        return res;
    }
}
