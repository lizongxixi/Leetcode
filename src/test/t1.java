package test;

/**
 * @author ZONGXI LI
 * @version 1.0.0
 * @ClassName t1.java
 * @Description TODO
 * @createTime 2021年10月30日 19:12:00
 */
public class t1 {
    public static void main(String[] args) {
        Integer t = Integer.valueOf(1000);
        Integer b = Integer.valueOf(1000);
        System.out.println(t);
        System.out.println(b);
        System.out.println(t.equals(b));
        System.out.println(t.equals(b));
        System.out.println(t.compareTo(b));
    }
}
