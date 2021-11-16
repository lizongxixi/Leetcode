package Array;

/**
 * @author ZONGXI LI
 * @version 1.0.0
 * @ClassName Solution367.java
 * @Description TODO
 * @createTime 2021年11月01日 14:12:00
 */
public class Solution367 {
    public boolean isPerfectSquare(int num) {
        int left = 0;
        int right = num;
        while(left <= right){
            int mid = left + (right - left)/2;
            if((long)mid * mid == num) return true;
            if((long)mid * mid < num) left = mid + 1;
            else right = mid - 1;
        }
        return false;
    }
}
