package _02_structural_patterns._07_proxy._02_after;

public class Client {

    public static void main(String[] args) throws InterruptedException {
//        GameService gameService = new GameServiceProxy(new DefaultGameService());
        GameService gameService = new GameServiceProxy();
        gameService.startGame();
    }
}
