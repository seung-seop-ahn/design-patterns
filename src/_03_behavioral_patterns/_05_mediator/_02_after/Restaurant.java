package _03_behavioral_patterns._05_mediator._02_after;

import java.time.LocalDateTime;

public class Restaurant {

    private FrontDesk frontDesk = new FrontDesk();

    public void dinner(Integer guestId, LocalDateTime dateTime) {
        String roomNumber = this.frontDesk.getRoomNumber(guestId);
        System.out.println("dinner " + roomNumber + " at " + dateTime);
    }

}
