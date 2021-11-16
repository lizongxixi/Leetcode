package Greedy;

import java.util.Arrays;

/**
 * @author ZONGXI LI
 * @version 1.0.0
 * @ClassName Summery.java
 * @Description TODO
 * @createTime 2021年10月10日 14:44:00
 */

public class Summery {
    public static void main(String[] args) {
        //创建p1对象，为了便于讲解就不用set方法和含参构造了
        Person p1 = new Person();
        p1.age = 24;
        p1.name = "张三";
        p1.show();

        //创建p2对象
        Person p2 = new Person();
        p2.age = 26;
        p2.name = "李四";
        p2.show();
    }
}
