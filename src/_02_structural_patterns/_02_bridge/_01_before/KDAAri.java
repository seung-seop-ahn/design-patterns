package _02_structural_patterns._02_bridge._01_before;

public class KDAAri implements Champion {
    
    @Override
    public void move() {
        System.out.println("KDA Ari move");
    }

    @Override
    public void skillQ() {
        System.out.println("KDA Ari Q");
    }

    @Override
    public void skillW() {
        System.out.println("KDA Ari W");
    }

    @Override
    public void skillE() {
        System.out.println("KDA Ari E");
    }

    @Override
    public void skillR() {
        System.out.println("KDA Ari R");
    }
}
