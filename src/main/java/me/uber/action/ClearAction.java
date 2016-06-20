package me.uber.action;

import me.uber.Action;
import me.uber.Turtle;
import me.uber.Window;

/**
 * Created by niakoi on 20/6/16.
 */
public class ClearAction implements Action {


    @Override
    public void perform(Window window, Turtle turtle) {
        for (int i = 0; i < window.getHeight(); i++) {
            for (int j = 0; j < window.getWidth(); j++) {
                window.unset(i, j);
            }
        }
    }
}
