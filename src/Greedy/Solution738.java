package Greedy;

import java.util.Arrays;

/**
 * @author ZONGXI LI
 * @version 1.0.0
 * @ClassName Solution738.java
 * @Description TODO
 * @createTime 2021年10月09日 10:42:00
 */
public class Solution738 {
    public int monotoneIncreasingDigits(int n) {
        int[] num = new int[10];
        Arrays.fill(num,0);
        int count = 0;
        while(n!=0){
            int N = n % 10;
            n = n/10;
            num[count++] = N;
        }
        int start = 0;
        int flag = 0;
        for(int i = 0;i < count-1;i++){
            if(num[i]<num[i+1] ){
                num[i+1]--;
                start = i;
                flag = 1;
            }
        }
        if(flag == 1){
            for (int i = start;i >0;i-- ){
                num[i] = 9;
            }
        }
        int result = 0;
        for(int i = 0;i < count;i++){
            result = num[i]*(int)Math.pow(10,i) + result;
        }
        return result;
    }

    public static void main(String[] args) {
        Solution738 solution738 = new Solution738();
        int ans = solution738.monotoneIncreasingDigits(1234);
        System.out.println(ans);
    }
}
