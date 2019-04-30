package Command;

/**
 * Invoker
 */
public class Waiter {
    private Command command; //可以持有多个命令引用，用于后续操作

    public void setCommand(Command command) {
        this.command = command;
    }

    public void invoke(int operation) {
        if (command == null) {
            System.out.println("No target");
            return;
        }
        switch (operation) {
            case 1:
                command.execute();
                break;
            case 2:
                command.undo();
                break;
            case 3:
                command.redo();
                break;
            default:
                System.out.println("No operation");
        }
    }
}
