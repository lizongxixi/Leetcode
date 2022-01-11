package Greedy;

/**
 * @author ZONGXI LI
 * @version 1.0.0
 * @ClassName Solution860_2.java
 * @Description TODO
 * @createTime 2022年01月10日 21:48:00
 */
public class Solution860_2 {
    public boolean lemonadeChange(int[] bills) {
        int five = 0;
        int ten = 0;
        for (int i = 0;i<bills.length;i++){
            if(bills[i] == 5) five++;
            if(bills[i] == 10){
                five--;
                ten++;
            }
            if(bills[i] == 20){
                if(ten > 0){
                    ten--;
                    five--;
                }else{
                    five -= 3;
                }
            }
            if (five < 0) return false;
        }
        return true;
    }
}
