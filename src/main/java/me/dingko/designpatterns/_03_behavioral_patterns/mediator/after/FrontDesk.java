package me.dingko.designpatterns._03_behavioral_patterns.mediator.after;

import java.time.LocalDateTime;

public class FrontDesk {
    //프론트데스크는 모든 Colleague를 알아야 한다.
    private CleaningService cleaningService = new CleaningService();
    private Restaurant restaurant = new Restaurant();

    public void getTowers(Guest guest, int numberOfTowers) {
        //Guest에 대한 모든 정보가 아니라, 필요한 정보만 넘긴다.
        cleaningService.getTowers(guest.getId(), numberOfTowers);
    }

    public String getRoomNumberFor(int guestId) {
        return "111";
    }

    public void dinner(Guest guest, LocalDateTime dateTime) {
        restaurant.dinner(guest.getId(), dateTime);
    }
}
