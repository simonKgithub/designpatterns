package me.dingko.designpatterns._03_behavioral_patterns.mediator;

public class Guest {
    // Guest는 Restaurant와 CleaningService를 의존한다.
    private Restaurant restaurant = new Restaurant();
    private CleaningService cleaningService = new CleaningService();

    public void dinner(){
        restaurant.dinner(this);
    }

    public void getTower(int numberOfTower) {
        cleaningService.getTower(this, numberOfTower);
    }
}
