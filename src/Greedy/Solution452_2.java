package Greedy;

import java.util.Arrays;

/**
 * @author ZONGXI LI
 * @version 1.0.0
 * @ClassName Solution452_2.java
 * @Description TODO
 * @createTime 2022年01月11日 09:00:00
 */
public class Solution452_2 {
    public int findMinArrowShots(int[][] points) {
        //先按左边界从小到大排序，再按右边界从小到大排序；
        // 注意边界很大导致int溢出的问题，所以使用Integer进行比较
        Arrays.sort(points,(o1, o2) -> {
            if (Integer.compare(o1[0],o2[0]) == 0) return Integer.compare(o1[1],o2[1]);
            return Integer.compare(o1[0],o2[0]);
        });

        //测试用 for (int[]p:points) System.out.println(Arrays.toString(p));
        int res = 1;
        //split为分割点
        int split =  points[0][1];
        for (int i = 1;i < points.length;i++){
            if(split >=  points[i][0]){
                //在本区间有更小的分割点，更新
                if(split > points[i][1]){
                    split = points[i][1];
                }
                continue;
            }else{
                //新区间
                split = points[i][1];
                res++;
            }
        }
        return res;
    }
}
