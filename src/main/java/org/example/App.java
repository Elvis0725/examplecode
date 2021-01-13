package org.example;

import java.util.HashMap;

/**
 * Hello world!
 */
public class App {
    private static final int ROW_SIZE = 1024 * 16;
    private static final int COLUMN_SIZE = 1024 * 16;
    private static final int LOOP_COUNT = 100;

    public static void main(String[] args) {
        long[][] array = new long[ROW_SIZE][COLUMN_SIZE];
        for (int i = 0; i < LOOP_COUNT; i++) {
            compare(array);
        }
    }

    private static void compare(long[][] array) {
        long start = System.currentTimeMillis();
        addRowByRow(array, ROW_SIZE, COLUMN_SIZE);
        long addRowByRowTime = System.currentTimeMillis() - start;
        start = System.currentTimeMillis();
        addColumnByColumn(array, ROW_SIZE, COLUMN_SIZE);
        long addColumnByColumnTime = System.currentTimeMillis() - start;
        System.out.println(addColumnByColumnTime * 1.0 / addRowByRowTime);
    }


    public static int addRowByRow(long[][] array, int rowSize, int columnSize) {
        int sum = 0;
        for (int i = 0; i < rowSize; i++) {
            for (int j = 0; j < columnSize; j++) {
                sum += array[i][j];
            }
        }
        return sum;
    }

    public static int addColumnByColumn(long[][] array, int rowSize, int columnSize) {
        int sum = 0;
        for (int i = 0; i < columnSize; i++) {
            for (int j = 0; j < rowSize; j++) {
                sum += array[j][i];
            }
        }
        return sum;
    }


}
