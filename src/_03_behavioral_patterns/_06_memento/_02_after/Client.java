package _03_behavioral_patterns._06_memento._02_after;

public class Client {

    public static void main(String[] args) {
        Game game = new Game();
        game.setRedTeamScore(10);
        game.setBlueTeamScore(20);

        GameSave save = game.save();

        game.setRedTeamScore(5);
        game.setBlueTeamScore(15);

        System.out.println(game.getRedTeamScore());
        System.out.println(game.getBlueTeamScore());

        game.restore(save);

        System.out.println(game.getRedTeamScore());
        System.out.println(game.getBlueTeamScore());
    }
}
