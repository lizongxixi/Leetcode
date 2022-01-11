package Greedy;

import java.util.Arrays;

/**
 * @author ZONGXI LI
 * @version 1.0.0
 * @ClassName Solution455_2.java
 * @Description TODO
 * @createTime 2022年01月05日 12:19:00
 */
public class Solution455_2 {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int res = 0;
        for(int i = g.length-1,j = s.length-1;i >= 0&& j>=0;i--){
            if(s[j] >= g[i]){
                res++;
                j--;
            }
        }
        return res;
    }
}
