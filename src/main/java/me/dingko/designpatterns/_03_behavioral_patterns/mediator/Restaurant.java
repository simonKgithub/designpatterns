package me.dingko.designpatterns._03_behavioral_patterns.mediator;

public class Restaurant {
    private CleaningService cleaningService = new CleaningService();

    public void clean() {
        cleaningService.clean(this);
    }

    public void dinner(Guest guest) {
        System.out.println("dinner " + guest);
    }
}
