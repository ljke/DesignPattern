package Command;

public class PigCommand implements Command {
    private Cook mCook;
    private int id;

    public PigCommand(Cook mCook, int id) {
        this.mCook = mCook;
        this.id = id;
    }

    @Override
    public void execute() {
        mCook.cookPig();
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
        return "PigCommand{" +
                "id=" + id +
                '}';
    }
}
