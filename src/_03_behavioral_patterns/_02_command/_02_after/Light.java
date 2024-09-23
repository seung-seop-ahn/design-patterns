package _03_behavioral_patterns._02_command._02_after;

public class Light {

    private boolean isOn;

    public void on() {
        System.out.println("turn on.");
        this.isOn = true;
    }

    public void off() {
        System.out.println("turn off.");
        this.isOn = false;
    }

    public boolean isOn() {
        return this.isOn;
    }
}
