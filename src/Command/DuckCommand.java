package Command;

public class DuckCommand implements Command {
    private Cook mCook;
    private int id;

    public DuckCommand(Cook cook, int id) {
        this.mCook = cook;
        this.id = id;
    }

    @Override
    public void execute() {
        mCook.cookDuck();
        mCook.add(this);
    }

    @Override
    public void undo() {
        mCook.remove(this);
    }

    @Override
    public void redo() {
        mCook.add(this);
    }

    @Override
    public String toString() {
        return "DuckCommand{" +
                "id=" + id +
                '}';
    }
}
