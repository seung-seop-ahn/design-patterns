package _03_behavioral_patterns._09_strategy._02_after;

public class Faster implements Speed {
    @Override
    public void blueLight() {
        System.out.println("Hello");
    }

    @Override
    public void redLight() {
        System.out.println("World.");
    }
}
