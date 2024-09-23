package _02_structural_patterns._07_proxy._02_after;

public class GameServiceProxy implements GameService{

    private GameService gameService;

//    public GameServiceProxy(GameService gameService) {
//        this.gameService = gameService;
//    }

    @Override
    public void startGame() {
        long before = System.currentTimeMillis();
        if(gameService == null) {
            this.gameService = new DefaultGameService();
        }
        this.gameService.startGame();
        System.out.println(System.currentTimeMillis() - before);
    }
}
