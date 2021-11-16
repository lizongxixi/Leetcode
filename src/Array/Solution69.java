package Array;

/**
 * @author ZONGXI LI
 * @version 1.0.0
 * @ClassName Solution69.java
 * @Description TODO
 * @createTime 2021年11月01日 12:26:00
 */
public class Solution69 {
    public int mySqrt(int x) {
        int left = 0;
        int right = x;
        while(left <= right){
            int mid = left + (right - left)/2;
            if((long)mid * mid == x) return mid;
            if((long)mid * mid < x) left = mid + 1;
            else right = mid - 1;
        }
        return left-1;
    }
}
