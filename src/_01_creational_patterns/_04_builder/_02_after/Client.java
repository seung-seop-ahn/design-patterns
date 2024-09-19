package _01_creational_patterns._04_builder._02_after;

import java.time.LocalDate;

public class Client {

    public static void main(String[] args) {
        TourPlanBuilder builder = new DefaultTourBuilder();
        TourPlan plan1 = builder
                .title("Korea")
                .nightsAndDays(2, 3)
                .startDate(LocalDate.of(2020, 12, 9))
                .whereToStay("Hotel")
                .addPlan(0, "Go Visit Seocho")
                .addPlan(1, "Go Shopping")
                .getPlan();

        TourDirector director = new TourDirector(new DefaultTourBuilder());
        TourPlan plan2 = director.tripToKorea();
    }
}
