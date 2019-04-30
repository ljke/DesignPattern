package Singleton;

public class TestSingleton implements Runnable {
    //在实例化对象时完成初始化
    private SingletonDCL singletonDCL = SingletonDCL.getInstance();
    private SingletonEager singletonEager = SingletonEager.getInstance();
    private SingletonInner singletonInner = SingletonInner.getInstance();
    private SingletonEnum singletonEnum = SingletonEnum.instance;

    @Override
    public void run() {
        SingletonDCL singletonDCL = SingletonDCL.getInstance();
        if (singletonDCL == this.singletonDCL) {
            System.out.println("Same SingletonDCL");
        } else {
            System.out.println("Different SingletonDCL");
            System.out.println(singletonDCL);
        }

        SingletonEager singletonEager = SingletonEager.getInstance();
        if (singletonEager == this.singletonEager) {
            System.out.println("Same SingletonEager");
        } else {
            System.out.println("Different SingletonEager");
            System.out.println(singletonEager);
        }

        SingletonInner singletonInner = SingletonInner.getInstance();
        if (singletonInner == this.singletonInner) {
            System.out.println("Same SingletonInner");
        } else {
            System.out.println("Different SingletonInner");
            System.out.println(singletonInner);
        }

        SingletonEnum singletonEnum = SingletonEnum.instance;
        if (System.identityHashCode(singletonEnum) == System.identityHashCode(this.singletonEnum)) {
            System.out.println("Same SingletonEnum");
        } else {
            System.out.println("Different SingletonEnum");
            System.out.println(singletonEnum);
        }
    }

    public static void main(String[] args) {
        TestSingleton test = new TestSingleton();
        for (int i = 0; i < 5; i++) {
            new Thread(test).start();
        }
    }
}
