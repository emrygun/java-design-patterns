package Singleton;

public class Singleton {
    private static Singleton uniqueInstance;
    private int value = 0;

    public void setValue(int tempValue) {
        value = tempValue;
    }

    public int getValue() {
        return value;
    }

    private Singleton() { }

    public static Singleton getInstance() {
        if (uniqueInstance == null)
            uniqueInstance = new Singleton();

        return uniqueInstance;
    }
}
