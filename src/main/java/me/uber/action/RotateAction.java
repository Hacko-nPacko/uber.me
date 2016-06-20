package me.uber.action;

import me.uber.Action;
import me.uber.Turtle;
import me.uber.Window;

/**
 * Created by niakoi on 20/6/16.
 */
public class RotateAction implements Action {
    int angle;

    public RotateAction(int angle) {
        this.angle = angle;
    }

    @Override
    public void perform(Window window, Turtle turtle) {
        int newDirection = turtle.getDirection() + angle;
        turtle.setDirection(newDirection);
    }
}
