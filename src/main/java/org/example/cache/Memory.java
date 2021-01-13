package org.example.cache;

import java.awt.*;

/**
 * @author jiangpan02
 * @date 2020/12/29 6:37 下午
 */
public class Memory implements IDrawer {

    private static final int START_X = 100;

    private static final int START_Y = 100;

    private static final int BOX_SIZE = 50;

    private int rowCount;

    private int[][] memories;

    public Memory(int size) {
        rowCount = size / Constants.ROW_SIZE;
        memories = new int[rowCount][Constants.ROW_SIZE];
        for (int i = 0; i < rowCount; i++) {
            for (int j = 0; j < Constants.ROW_SIZE; j++) {
                memories[i][j] = i * Constants.ROW_SIZE + j;
            }
        }
    }

    public void draw(Graphics2D g) {
        for (int i = 0; i < rowCount; i++) {
            for (int j = 0; j < Constants.ROW_SIZE; j++) {
                int x = START_X + i * BOX_SIZE;
                int y = START_Y + j * BOX_SIZE;
                g.drawRect(x, y, BOX_SIZE, BOX_SIZE);
            }
        }
    }
}
