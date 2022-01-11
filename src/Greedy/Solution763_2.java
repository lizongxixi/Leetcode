package Greedy;

import java.util.LinkedList;
import java.util.List;

/**
 * @author ZONGXI LI
 * @version 1.0.0
 * @ClassName Solution763_2.java
 * @Description TODO
 * @createTime 2022年01月11日 09:56:00
 */
public class Solution763_2 {
    public List<Integer> partitionLabels(String s) {
        List<Integer> res = new LinkedList<>();
        char[] chars = s.toCharArray();
        int[] hash = new int[27];
        for (int i = 0; i < chars.length; i++) {
            //寻找每个字母的最远边界
            hash[chars[i]-'a'] = i;
        }
        int left = 0;
        int right = 0;
        for (int i = 0; i < chars.length; i++) {
            right = Math.max(right,hash[chars[i]-'a']);
            if (i == right){
                res.add(right-left+1);
                left = right+1;
            }
        }
        return res;
    }
}
