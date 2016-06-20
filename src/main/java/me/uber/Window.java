package me.uber;

import java.io.PrintStream;

/**
 * Created by niakoi on 20/6/16.
 */
public class Window {


    int[][] window;
    private int height;
    private int width;


    public Window(int height, int width) {
        this.height = height;
        this.width = width;

        window = new int[height][width];
    }

    public void set(int x, int y) {
        window[x][y] = 1;
    }

    public void unset(int x, int y) {
        window[x][y] = 0;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public void print(PrintStream out) {
        for (int i = 0; i < width; i++) {
            for (int j = 0; j < height; j++) {

                out.print(window[i][j]);
            }
            out.println();
        }
    }
}
