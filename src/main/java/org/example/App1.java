package org.example;

import java.util.HashMap;

/**
 * Hello world!
 */
public class App1 {
    public static void main(String[] args) {

        HashMap<String, String> map = new HashMap<>(1);
        map.put("1", "1");
    }

    public static int add(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum;
    }

    public static int addRowByRow(int[][] array, int rowSize, int columnSize) {
        int sum = 0;
        for (int i = 0; i < rowSize; i++) {
            for (int j = 0; j < columnSize; j++) {
                sum += array[i][j];
            }
        }
        return sum;
    }

    public static int addColumnByColumn(int[][] array, int rowSize, int columnSize) {
        int sum = 0;
        for (int i = 0; i < columnSize; i++) {
            for (int j = 0; j < rowSize; j++) {
                sum += array[j][i];
            }
        }
        return sum;
    }
}
