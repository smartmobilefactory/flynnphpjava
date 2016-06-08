package test;

import com.beust.jcommander.JCommander;

public class Hello {
    public static void main(String[] args) {

        CLI cli = new CLI();
        new JCommander(cli, args);

        if (cli.debug) {
            System.out.println("Hello " + cli.name);
        }

    }
}
