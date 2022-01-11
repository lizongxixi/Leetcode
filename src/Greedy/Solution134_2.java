package Greedy;

/**
 * @author ZONGXI LI
 * @version 1.0.0
 * @ClassName Solution134_2.java
 * @Description TODO
 * @createTime 2022年01月10日 19:57:00
 */
public class Solution134_2 {
    //只要油够，就一定会有解(解题关键)
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int total = 0;
        int now = 0;
        int start = 0;
        //如果到了gas.length-1，那么说明前面的都不满足条件
        // 如果gas.length-1的now还是小于0，说明油量是不够的，即返回-1
        for (int i = 0;i < gas.length;i++){
            now += gas[i]-cost[i];
            total +=gas[i]-cost[i];
            if(now<0){
                start = i+1;
                now = 0;
            }
        }
        if (total<0) return -1;
        return start;
    }
}
