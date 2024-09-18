package singleton;

public class SingletonThreadSafe1 {
    private static SingletonThreadSafe1 instance;

    private SingletonThreadSafe1() {
        // "new Singleton()" Not Available
    }

    // Easiest
    // Only one thread can access this method
    // Performance penalty may occur
    public static synchronized SingletonThreadSafe1 getInstance() {
        if (instance == null) {
            instance = new SingletonThreadSafe1();
        }
        return instance;
    }
}
