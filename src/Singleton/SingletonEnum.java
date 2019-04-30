package Singleton;

public enum SingletonEnum {
    instance; //枚举常量是public static final

    SingletonEnum(){ //枚举类的构造方法默认是私有的
        System.out.println("SingletonEnum Create " + System.identityHashCode(this));
    }
}
