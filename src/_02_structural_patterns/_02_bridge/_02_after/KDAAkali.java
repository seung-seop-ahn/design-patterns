package _02_structural_patterns._02_bridge._02_after;

public class KDAAkali implements Champion {
    
    @Override
    public void move() {
        System.out.println("KDA Akali move");
    }

    @Override
    public void skillQ() {
        System.out.println("KDA Akali Q");
    }

    @Override
    public void skillW() {
        System.out.println("KDA Akali W");
    }

    @Override
    public void skillE() {
        System.out.println("KDA Akali E");
    }

    @Override
    public void skillR() {
        System.out.println("KDA Akali R");
    }
}
