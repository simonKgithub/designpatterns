package me.dingko.designpatterns._01_creational_patterns._04_builder._02_after;

import java.time.LocalDate;

public class App {
    public static void main(String[] args) {
        TourDirector director = new TourDirector(new DefaultTourBuilder());
        TourPlan tourPlan = director.cancunTrip();
        TourPlan shortTourPlan = director.longBeachTrip();
        System.out.println(tourPlan);
        System.out.println(shortTourPlan);
    }
}
