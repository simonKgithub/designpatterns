package me.dingko.designpatterns._01_creational_patterns._04_builder._02_after;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

public class App {
    public static void main(String[] args) {
        TourDirector director = new TourDirector(new DefaultTourBuilder());
        TourPlan tourPlan = director.cancunTrip();
        System.out.println(tourPlan);

        TourPlan shortTourPlan = director.longBeachTrip();
        System.out.println(shortTourPlan);
    }
}
