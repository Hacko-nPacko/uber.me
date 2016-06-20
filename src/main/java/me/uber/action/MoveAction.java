package me.uber.action;

import me.uber.Action;
import me.uber.Point;
import me.uber.Turtle;
import me.uber.Window;

/**
 * Created by niakoi on 20/6/16.
 */
public class MoveAction implements Action{


    int steps;

    public MoveAction(int steps) {
        this.steps = steps;
    }

    @Override
    public void perform(Window window, Turtle turtle) {


        Point state = turtle.getState();
        for (int i = 0; i < steps; i++) {
            turtle.set(state.getX(), state.getY());
            window.set(state.getX(), state.getY());
            state = move(turtle);

        }

    }

    private Point move(Turtle turtle) {
        int newX = (int)Math.ceil(turtle.getState().getX() + Math.cos(turtle.getDirection()));
        int newY = (int)Math.ceil(turtle.getState().getY() + Math.sin(turtle.getDirection()));
        //




        return new Point(newX, newY);
    }
}
