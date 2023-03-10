package me.dingko.designpatterns._03_behavioral_patterns.mediator.after;

import java.time.LocalDateTime;

public class Restaurant {
    private FrontDesk frontDesk = new FrontDesk();

    public void dinner(int guestId, LocalDateTime dateTime) {
        String roomNumber = frontDesk.getRoomNumberFor(guestId);
        System.out.println("provide dinner at " + dateTime + " and charge to " + roomNumber);
    }
}
