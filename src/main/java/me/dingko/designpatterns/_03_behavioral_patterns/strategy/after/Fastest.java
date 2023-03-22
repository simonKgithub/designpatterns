package me.dingko.designpatterns._03_behavioral_patterns.strategy.after;

public class Fastest implements Speed{
    @Override
    public void blueLight() {
        System.out.println("무-취");
    }

    @Override
    public void redLight() {
        System.out.println("펴쑴당");
    }
}
