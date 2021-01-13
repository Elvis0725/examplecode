package org.example;

/**
 * @author jiangpan02
 * @date 2021/1/10 4:46 下午
 */
public class Cmp {

    private static final int LOOP_COUNT = Integer.MAX_VALUE;

    public static void main(String[] args) {
        while (true) {
            long timeA = test1();
            long timeB = test2();
            System.out.println(timeA + " " + timeB);
        }
    }

    private static long test1() {
        long start = System.currentTimeMillis();
        int op = 1 << 25;
        long remainder = 0;
        for (long i = 0; i < Integer.MAX_VALUE; i++) {
            remainder = i % op;
        }
        System.out.println(remainder);
        return System.currentTimeMillis() - start;
    }

    private static long test2() {
        long start = System.currentTimeMillis();
        int op = (1 << 25) - 1;
        long remainder = 0;
        for (long i = 0; i < Integer.MAX_VALUE; i++) {
            remainder = i & (op - 1);
        }
        System.out.println(remainder);
        return System.currentTimeMillis() - start;
    }
}
