package _02_structural_patterns._07_proxy._02_after;

public class DefaultGameService implements GameService {
    @Override
    public void startGame() {
        System.out.println("Welcome to game.");
    }
}
