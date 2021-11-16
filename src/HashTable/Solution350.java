package HashTable;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

/**
 * @author ZONGXI LI
 * @version 1.0.0
 * @ClassName Solution350.java
 * @Description TODO
 * @createTime 2021年11月03日 22:37:00
 */
public class Solution350 {
    public int[] intersect(int[] nums1, int[] nums2) {
        Map<Integer,Integer> map = new HashMap<>();
        //安排每个数字出现次数
        for(int i : nums1){
            int value = map.getOrDefault(i,0);
            map.put(i,value+1);
        }
        LinkedList<Integer> res = new LinkedList<>();
        for(int i : nums2){
            int value = map.getOrDefault(i,0);
            if(value != 0){
                res.add(i);
                map.put(i,value-1);
            }
        }
        int[] result = new int[res.size()];
        int j = 0;
        for (int i : res){
            result[j++] = i;
        }
        return result;
    }
}
