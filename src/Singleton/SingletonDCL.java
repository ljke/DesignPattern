package Singleton;

import java.io.Serializable;

public class SingletonDCL implements Serializable {
    //使用volatile保证可见性
    private volatile static SingletonDCL instance = null;

    //私有构造方法防止外部创建
    private SingletonDCL() {
        System.out.println("SingletonDCL Create " + this.toString());
    }

    public static SingletonDCL getInstance() {
        if (instance == null) {
            synchronized (SingletonDCL.class) {
                if (instance == null) {
                    instance = new SingletonDCL();
                }
            }
        }
        return instance;
    }

    //解决序列化问题
    public Object readResolve() {
        return getInstance();
    }
}
