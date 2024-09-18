package creation.singleton;

import java.io.*;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class SingletonThreadSafe4 implements Serializable {
    private SingletonThreadSafe4() {
        // "new Singleton()" Not Available
    }

    // Static inner class
    // Most recommended
    private static class SingletonHolder {
        private static final SingletonThreadSafe4 INSTANCE = new SingletonThreadSafe4();
    }

    public static SingletonThreadSafe4 getInstance() {
        return SingletonHolder.INSTANCE;
    }

    public static void singletonBreaker1(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        SingletonThreadSafe4 singleton1 = SingletonThreadSafe4.getInstance();

        // Reflection
        Constructor<SingletonThreadSafe4> constructor = SingletonThreadSafe4.class.getDeclaredConstructor();
        constructor.setAccessible(true);

        SingletonThreadSafe4 singleton2 = constructor.newInstance();

        // false
        System.out.println(singleton1 == singleton2);
    }

    public static void singletonBreaker2(String[] args) throws IOException, ClassNotFoundException {
        SingletonThreadSafe4 singleton1 = SingletonThreadSafe4.getInstance();
        SingletonThreadSafe4 singleton2 = null;

        // Serialization
        try (ObjectOutput out = new ObjectOutputStream(new FileOutputStream("singleton.obj"))) {
            out.writeObject(singleton1);
        }

        // Deserialization
        try (ObjectInput input = new ObjectInputStream(new FileInputStream("singleton.obj"))) {
            singleton2 = (SingletonThreadSafe4) input.readObject();
        }

        // false
        System.out.println(singleton1 == singleton2);
    }

    // Serialization & Deserialization preventive
    protected Object readResolve() {
        return getInstance();
    }
}
