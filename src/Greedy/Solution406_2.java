package Greedy;

import java.util.Arrays;
import java.util.LinkedList;

/**
 * @author ZONGXI LI
 * @version 1.0.0
 * @ClassName Solution406_2.java
 * @Description TODO
 * @createTime 2022年01月10日 21:52:00
 */
public class Solution406_2 {
    public int[][] reconstructQueue(int[][] people) {
        Arrays.sort(people,(o1, o2) ->{
            if (o1[0] == o2[0]) return o1[1] - o2[1];
            return o2[0] - o1[0];
        });
        LinkedList<int[]> que = new LinkedList<>();
        for (int[] p:people){
            que.add(p[1],p);
        }
        return que.toArray(new int[que.size()][]);
    }
}
