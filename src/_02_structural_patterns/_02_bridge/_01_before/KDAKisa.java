package _02_structural_patterns._02_bridge._01_before;

public class KDAKisa implements Champion {
    
    @Override
    public void move() {
        System.out.println("KDA Kisa move");
    }

    @Override
    public void skillQ() {
        System.out.println("KDA Kisa Q");
    }

    @Override
    public void skillW() {
        System.out.println("KDA Kisa W");
    }

    @Override
    public void skillE() {
        System.out.println("KDA Kisa E");
    }

    @Override
    public void skillR() {
        System.out.println("KDA Kisa R");
    }
}
