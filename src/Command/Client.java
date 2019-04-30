package Command;

public class Client {
    public void assembleAction() {
        Cook mCook = new Cook();
        Waiter mWaiter = new Waiter();

        mWaiter.setCommand(new PigCommand(mCook, 0));
        mWaiter.invoke(1);
        mWaiter.invoke(2);
        mWaiter.invoke(3);

        mWaiter.setCommand(new DuckCommand(mCook, 1));
        mWaiter.invoke(1);

        mWaiter.setCommand(new PigCommand(mCook, 2));
        mWaiter.invoke(1);
    }
}
