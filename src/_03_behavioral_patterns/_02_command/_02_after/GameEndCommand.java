package _03_behavioral_patterns._02_command._02_after;

public class GameEndCommand implements Command {

    private Game game;

    public GameEndCommand(Game game) {
        this.game = game;
    }

    @Override
    public void execute() {
        this.game.start();
    }

    @Override
    public void undo() {
        new GameStartCommand(this.game).execute();
    }
}
