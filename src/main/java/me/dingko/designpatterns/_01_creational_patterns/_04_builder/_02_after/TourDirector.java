package me.dingko.designpatterns._01_creational_patterns._04_builder._02_after;

import java.time.LocalDate;

public class TourDirector {

    private TourPlanBuilder tourPlanBuilder;

    public TourDirector(TourPlanBuilder tourPlanBuilder) {
        this.tourPlanBuilder = tourPlanBuilder;
    }

    public TourPlan part1(){
        return tourPlanBuilder
                .title("shortTrip")
                .nightsAndDays(2,3)
                .startDate(LocalDate.of(2023,6,29))
                .whereToStay("리조트")
                .addPlan(0, "짐풀기")
                .addPlan(1, "놀기")
                .addPlan(3, "컴백 홈")
                .getPlan();
    }
}
