package _02_structural_patterns._02_bridge._02_after;

public class PoolPartyKisa implements Champion {
    
    @Override
    public void move() {
        System.out.println("PoolParty Kisa move");
    }

    @Override
    public void skillQ() {
        System.out.println("PoolParty Kisa Q");
    }

    @Override
    public void skillW() {
        System.out.println("PoolParty Kisa W");
    }

    @Override
    public void skillE() {
        System.out.println("PoolParty Kisa E");
    }

    @Override
    public void skillR() {
        System.out.println("PoolParty Kisa R");
    }
}
