package Greedy;

import java.util.Arrays;

/**
 * @author ZONGXI LI
 * @version 1.0.0
 * @ClassName Solution435_2.java
 * @Description TODO
 * @createTime 2022年01月11日 09:39:00
 */
public class Solution435_2 {
    public int eraseOverlapIntervals(int[][] intervals) {
        Arrays.sort(intervals,(o1, o2) -> {
            if (Integer.compare(o1[0],o2[0]) == 0) return Integer.compare(o1[1],o2[1]);
            return Integer.compare(o1[0],o2[0]);
        });
        int res = 0;
        int split = intervals[0][1];
        for (int i = 1; i < intervals.length; i++) {
            if (split > intervals[i][0]){
                res++;
                split = Math.min(split,intervals[i][1]);
            }else {
                split = intervals[i][1];
            }
        }
        return res;
    }
}
