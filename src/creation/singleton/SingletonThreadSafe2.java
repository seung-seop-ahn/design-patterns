package creation.singleton;

public class SingletonThreadSafe2 {
    // Eager initialization
    // If initialization takes long time or uses more memory then application loading time will be increased
    // Must check if this instance is really used in application
    private static final SingletonThreadSafe2 INSTANCE = new SingletonThreadSafe2();

    private SingletonThreadSafe2() {
        // "new Singleton()" Not Available
    }

    public static SingletonThreadSafe2 getInstance() {
        return INSTANCE;
    }
}
