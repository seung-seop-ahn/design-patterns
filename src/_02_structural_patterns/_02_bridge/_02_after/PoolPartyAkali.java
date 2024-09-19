package _02_structural_patterns._02_bridge._02_after;

public class PoolPartyAkali implements Champion {
    
    @Override
    public void move() {
        System.out.println("PoolParty Akali move");
    }

    @Override
    public void skillQ() {
        System.out.println("PoolParty Akali Q");
    }

    @Override
    public void skillW() {
        System.out.println("PoolParty Akali W");
    }

    @Override
    public void skillE() {
        System.out.println("PoolParty Akali E");
    }

    @Override
    public void skillR() {
        System.out.println("PoolParty Akali R");
    }
}
