package _03_behavioral_patterns._02_command._01_before;

public class Game {

    private boolean isStarted;

    public void start() {
        System.out.println("start game.");
        this.isStarted = true;
    }

    public void end() {
        System.out.println("end game.");
        this.isStarted = false;
    }

    public boolean isStarted() {
        return isStarted;
    }
}
