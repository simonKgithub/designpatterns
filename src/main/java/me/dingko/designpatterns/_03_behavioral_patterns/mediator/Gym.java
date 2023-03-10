package me.dingko.designpatterns._03_behavioral_patterns.mediator;

public class Gym {
    private CleaningService cleaningService;

    public void clean(){
        cleaningService.clean(this);
    }
}
