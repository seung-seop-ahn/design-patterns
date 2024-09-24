package _03_behavioral_patterns._09_strategy._02_after;

public class Normal implements Speed {
    @Override
    public void blueLight() {
        System.out.println("H e l    l   o");
    }

    @Override
    public void redLight() {
        System.out.println("W o r l  d.");
    }
}
