package me.uber;

import me.uber.action.ClearAction;
import me.uber.action.MoveAction;
import me.uber.action.RotateAction;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by niakoi on 20/6/16.
 */
public class Commander {


    List<Action> actions = new ArrayList<>();

    public void make(String command) {

        // C
        // L45
        int parameter = 0;
        if (command.length() > 1) {
            try {
                parameter = Integer.parseInt(command.substring(1));
            } catch (NumberFormatException nfe) {
                System.out.println("nfe = " + nfe);
                nfe.printStackTrace();
            }
        }
        if (command.length() > 0) {
            switch (command.charAt(0)) {
                case 'C':
                    actions.add(new ClearAction());
                    break;
                case 'L':
                    actions.add(new RotateAction(parameter));
                    break;
                case 'R':
                    actions.add(new RotateAction(parameter));
                    break;
                case 'F':
                    actions.add(new MoveAction(parameter));
                    break;

            }
        }




    }

    public void perform(Window window, Turtle turtle) {
        for (Action action : actions) {
            action.perform(window, turtle);
        }
    }
}
