package _03_behavioral_patterns._09_strategy._01_before;

public class BlueLightRedLight {

    private int speed;

    public BlueLightRedLight(int speed) {
        this.speed = speed;
    }

    public void blueLight() {
        if (speed == 1) {
            System.out.println("H e l    l   o");
        } else if (speed == 2) {
            System.out.println("Hello");
        } else {
            System.out.println("helo");
        }

    }

    public void redLight() {
        if (speed == 1) {
            System.out.println("W o r l  d.");
        } else if (speed == 2) {
            System.out.println("World.");
        } else {
            System.out.println("word");
        }
    }
}
