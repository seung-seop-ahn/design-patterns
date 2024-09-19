package _01_creational_patterns._04_builder._01_before;

import java.time.LocalDate;

public class Client {

    public static void main(String[] args) {
        TourPlan shortTrip = new TourPlan();
        shortTrip.setTitle("Japan");
        shortTrip.setStartDate(LocalDate.of(2021, 7, 15));

        TourPlan tourPlan = new TourPlan();
        tourPlan.setTitle("Korea");
        tourPlan.setNights(2);
        tourPlan.setDays(3);
        tourPlan.setStartDate(LocalDate.of(2020, 12, 9));
        tourPlan.setWhereToStay("Hotel");
        tourPlan.addPlan(0, "Check in");
        tourPlan.addPlan(0, "Dinner");
        tourPlan.addPlan(1, "Breakfast");
        tourPlan.addPlan(2, "Check out");
    }
}
