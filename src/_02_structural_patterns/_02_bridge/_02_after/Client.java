package _02_structural_patterns._02_bridge._02_after;

public class Client {

    public static void main(String[] args) {
        Champion kdaAri = new Ari(new KDA());
        kdaAri.move();
        kdaAri.skillQ();

        Champion poolPartyAri = new Ari(new PoolParty());
        poolPartyAri.move();
        poolPartyAri.skillQ();
    }
}
