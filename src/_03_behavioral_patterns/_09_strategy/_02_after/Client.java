package _03_behavioral_patterns._09_strategy._02_after;

public class Client {
    public static void main(String[] args) {
//        BlueLightRedLight game = new BlueLightRedLight(new Normal());
//        game.blueLight();
//        game.redLight();

        BlueLightRedLight game = new BlueLightRedLight();
        game.blueLight(new Normal());
        game.redLight(new Faster());
        game.redLight(new Speed() {

            @Override
            public void blueLight() {
                System.out.println("blue speed");
            }

            @Override
            public void redLight() {
                System.out.println("red speed");
            }
        });
    }
}
