package singleton;

public class Singleton {
    private static Singleton instance;

    private Singleton() {
        // "new Singleton()" Not Available
    }

    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}
