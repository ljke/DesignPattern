package Command;

import java.util.ArrayList;
import java.util.List;

/**
 * Receiver
 */
public class Cook {
    private List<Command> commands;

    public Cook() {
        this.commands = new ArrayList<Command>();
    }


    public void cookPig() {
        System.out.println("Cook Pig");
    }

    public void cookDuck() {
        System.out.println("Cook Duck");
    }

    public void add(Command command){
        commands.add(command);
        System.out.println("After cook");
        System.out.println(commands);
    }

    public void remove(Command command) {
        commands.remove(command);
        System.out.println("After undo");
        System.out.println(commands);
    }
}
