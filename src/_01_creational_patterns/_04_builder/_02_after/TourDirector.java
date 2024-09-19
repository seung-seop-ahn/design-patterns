package _01_creational_patterns._04_builder._02_after;

import java.time.LocalDate;

public class TourDirector {

    private TourPlanBuilder builder;

    public TourDirector(TourPlanBuilder builder) {
        this.builder = builder;
    }

    public TourPlan tripToKorea() {
        return builder
                .title("Korea")
                .nightsAndDays(2, 3)
                .startDate(LocalDate.of(2020, 12, 9))
                .whereToStay("Hotel")
                .addPlan(0, "Go Visit Seocho")
                .addPlan(1, "Go Shopping")
                .getPlan();
    }
}
