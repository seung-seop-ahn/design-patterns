package creation.singleton;

public class SingletonThreadSafe3 {
    private static volatile SingletonThreadSafe3 instance;

    private SingletonThreadSafe3() {
        // "new Singleton()" Not Available
    }

    // Double checked locking
    public static SingletonThreadSafe3 getInstance() {
        if (instance == null) {
            synchronized (SingletonThreadSafe3.class) {
                if (instance == null) {
                    instance = new SingletonThreadSafe3();
                }
            }
        }
        return instance;
    }
}
