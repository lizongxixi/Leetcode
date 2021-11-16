package HashTable;

import java.util.HashMap;
import java.util.Map;

/**
 * @author ZONGXI LI
 * @version 1.0.0
 * @ClassName Solution202_2.java
 * @Description TODO
 * @createTime 2021年11月03日 23:00:00
 */
public class Solution202_2 {
    public boolean isHappy(int n) {
        Map<Integer,Integer> map = new HashMap<>();
        while(true){
            n = calculate(n);
            // 为1，即为快乐树，跳出循环
            if(n == 1){
                break;
            }
            //如果已经出现，那么说明已经发生循环，那么就不是快乐数
            int value = map.getOrDefault(n,0);
            if(value != 0){
                return false;
            }
            map.put(n,value+1);
        }
        return true;
    }
    //计算各位数的平方和
    private int calculate(int n){
        String[] nums = (n+"").split("");
        int sum = 0;
        for (String s : nums){
            int i = Integer.parseInt(s);
            sum += i*i;
        }
        //System.out.println(sum);
        return sum;
    }

    public static void main(String[] args) {
        Solution202_2 solution202_2 = new Solution202_2();
        solution202_2.calculate(122);
    }
}
