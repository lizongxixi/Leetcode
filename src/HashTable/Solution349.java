package HashTable;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * @author ZONGXI LI
 * @version 1.0.0
 * @ClassName Solution349.java
 * @Description TODO
 * @createTime 2021年11月03日 22:22:00
 */
public class Solution349 {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> res = new HashSet<>();
        Set<Integer> set = new HashSet<>();
        for(int i : nums1){
            set.add(i);
        }
        for(int i : nums2){
            if(set.contains(i)){
                res.add(i);
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
