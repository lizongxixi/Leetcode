package HashTable;

import java.util.HashMap;
import java.util.Map;

/**
 * @author ZONGXI LI
 * @version 1.0.0
 * @ClassName Solution454.java
 * @Description TODO
 * @createTime 2021年11月04日 13:28:00
 */
public class Solution454 {
    public int fourSumCount(int[] nums1, int[] nums2, int[] nums3, int[] nums4) {
        int res = 0;
        //map1 为key：前两个数的和，以及 value组成该和的组合数
        //map2 为后两位
        Map<Integer,Integer> map1 = new HashMap<>();
        Map<Integer,Integer> map2 = new HashMap<>();
        for(int i : nums1){
            for(int j : nums2){
                int sum = i + j;
                int value = map1.getOrDefault(sum,0);
                map1.put(sum,value+1);
            }
        }
        for(int i : nums3){
            for(int j : nums4){
                int sum = i + j;
                int value = map2.getOrDefault(sum,0);
                map2.put(sum,value+1);
            }
        }
        for (int i : map1.keySet()){
            if (map2.containsKey(-i)){
                res += map1.get(i)*map2.get(-i);
            }
        }
        return res;
    }
}
