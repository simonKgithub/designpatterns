package me.dingko.designpatterns._01_creational_patterns._04_builder._02_after;

public class App {

    public static void main(String[] args) {
        TourPlan part1Trip =  new TourDirector(new DefaultTourBuilder()).part1();
        System.out.println("part1Trip = " + part1Trip);
    }
}
