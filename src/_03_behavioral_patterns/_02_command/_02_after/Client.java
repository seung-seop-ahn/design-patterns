package _03_behavioral_patterns._02_command._02_after;

public class Client {

    private Command command;

    public Client(Command command) {
        this.command = command;
    }

    public void press() {
        command.execute();
    }

    public static void main(String[] args) {
        Client client = new Client(new LightOffCommand(new Light()));
        client.press();
        client.press();
        client.press();
        client.press();
    }
}
