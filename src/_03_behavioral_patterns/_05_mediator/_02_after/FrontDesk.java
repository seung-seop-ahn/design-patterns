package _03_behavioral_patterns._05_mediator._02_after;

import java.time.LocalDateTime;

public class FrontDesk {

    private CleaningService cleaningService = new CleaningService();

    private Restaurant restaurant = new Restaurant();

    public void getTower(Guest guest, int numberOfTower) {
        this.cleaningService.getTower(guest.getId(), numberOfTower);
    }

    public String getRoomNumber(Integer guestId) {
        return "1";
    }

    public void dinner(Guest guest, LocalDateTime dateTime) {
        this.restaurant.dinner(guest.getId(), dateTime);
    }
}
