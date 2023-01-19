package me.dingko.designpatterns._01_creational_patterns._04_builder._02_after;

import java.time.LocalDate;

public class TourDirector {
    private  TourPlanBuilder tourPlanBuilder;

    //생성자 주입
    public TourDirector(TourPlanBuilder tourPlanBuilder) {
        this.tourPlanBuilder = tourPlanBuilder;
    }

    //칸쿤여행상품
    public TourPlan cancunTrip(){
        return tourPlanBuilder.title("칸 쿤 여행")
                    .nightsAndDays(2,3)
                    .startDate(LocalDate.of(2023,1,28))
                    .whereToStay("리조트")
                    .addPlan(0, "체크인하고 짐풀기")
                    .addPlan(0, "저녁 식사")
                    .getPlan();
    }

    //롱비치여행상품
    public TourPlan longBeachTrip(){
        return tourPlanBuilder.title("롱비치")
                .startDate(LocalDate.of(2023,1,28))
                .getPlan();
    }
}
