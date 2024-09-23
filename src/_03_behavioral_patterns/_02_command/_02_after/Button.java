package _03_behavioral_patterns._02_command._02_after;

public class Button {

    private Command command;

    public Button(Command command) {
        this.command = command;
    }

    public void press() {
        command.execute();
    }

    public static void main(String[] args) {
//        Button button = new Button(new LightOnCommand(new Light()));
        Button button = new Button(new GameStartCommand(new Game()));
        button.press();
        button.press();
    }
}
