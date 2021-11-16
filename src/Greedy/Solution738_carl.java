package Greedy;

import java.util.Arrays;

/**
 * @author ZONGXI LI
 * @version 1.0.0
 * @ClassName Solution738_carl.java
 * @Description TODO
 * @createTime 2021年10月09日 11:01:00
 */
public class Solution738_carl {
    public int monotoneIncreasingDigits(int N) {
        //例 N = 1234 则 N+""变成了字符串"1234" split表示将字符串分割为字符串数组，且分割界限为""
        // 在这里就是将字符串中的每个字符单独变成一个字符串
        String[] strings = (N + "").split("");
//        System.out.println(Arrays.toString(strings));
//        System.out.println(strings[strings.length-1]);
        int start = strings.length;
        for (int i = strings.length - 1; i > 0; i--) {
            if (Integer.parseInt(strings[i]) < Integer.parseInt(strings[i - 1])) {
                strings[i - 1] = (Integer.parseInt(strings[i - 1]) - 1) + "";
                start = i;
            }
        }
        for (int i = start; i < strings.length; i++) {
            strings[i] = "9";
        }
        return Integer.parseInt(String.join("",strings));
    }
    public static void main(String[] args) {
        Solution738_carl solution738 = new Solution738_carl();
        int ans = solution738.monotoneIncreasingDigits(1234);
        System.out.println(ans);
    }
}

    