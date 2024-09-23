package _03_behavioral_patterns._05_mediator._02_after;

public class CleaningService {

    private FrontDesk frontDesk = new FrontDesk();

    public void getTower(Integer guestId, int numberOfTower) {
        String roomNumber = this.frontDesk.getRoomNumber(guestId);
        System.out.println(numberOfTower + " towers to " + roomNumber);
    }
}
