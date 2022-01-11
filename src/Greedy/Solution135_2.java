package Greedy;

import java.util.Arrays;

/**
 * @author ZONGXI LI
 * @version 1.0.0
 * @ClassName Solution135_2.java
 * @Description TODO
 * @createTime 2022年01月10日 20:58:00
 */
public class Solution135_2 {
    public int candy(int[] ratings) {
        int res = 0;

        int[] myMethod = new int[ratings.length];
        //从右往左遍历，确保当前的值比右边的大
        Arrays.fill(myMethod,1);
        for(int i = ratings.length-2;i >= 0;i--){
            if(ratings[i] > ratings[i+1]){
                myMethod[i]=myMethod[i+1]+1;
            }
        }
        //从左往右遍历，确保当前的值比左边的大
        for(int i = 1;i < ratings.length;i++){
            if(ratings[i] > ratings[i-1] &&myMethod[i] <= myMethod[i-1]){
                myMethod[i] = myMethod[i-1]+1;
            }
        }
        for (int i:myMethod){
            res+=i;
        }
        return res;
    }
}
