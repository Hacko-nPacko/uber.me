package me.uber;

import java.util.regex.Pattern;

/**
 * Created by niakoi on 20/6/16.
 */
public class Main {


    public static void main(String[] args) {

        // TODO console reader
        String input = "CL45F50L125";

        Commander commander = new Commander();
        String[] commands = input.split("[(C|L|R|F)[0-9]*]+");
        for (String command : commands) {
            commander.make(command);
        }

        Window window = new Window(100, 100);

        Turtle turtle = new Turtle(50, 50);
        commander.perform(window, turtle);
    }
}
