package me.uber;

import org.junit.Test;

/**
 * Created by niakoi on 20/6/16.
 */
public class CommanderTest {

    @Test
    public void test01() throws Exception {
        String input = "CL45F50L125";

        Commander commander = new Commander();
        String[] commands = input.split("[(C|L|R|F)[0-9]*]+");
        for (String command : commands) {
            System.out.println("command = " + command);
            commander.make(command);
        }

        Window window = new Window(100, 100);

        Turtle turtle = new Turtle(50, 50);
        commander.perform(window, turtle);

        window.print(System.out);
    }
}
