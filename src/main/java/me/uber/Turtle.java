package me.uber;


import lombok.Getter;
import lombok.Setter;

/**
 * Created by niakoi on 20/6/16.
 */
public class Turtle {


    @Getter
    Point state;

    @Getter
    @Setter
    int direction;

    public Turtle(int x, int y) {
        state = new Point(x, y);
    }

    public void set(int x, int y) {
        // TODO check if something is worng...

        state = new Point(x, y);
    }

}
