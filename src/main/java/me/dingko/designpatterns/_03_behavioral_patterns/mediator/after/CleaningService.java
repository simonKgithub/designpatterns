package me.dingko.designpatterns._03_behavioral_patterns.mediator.after;

public class CleaningService {
    private FrontDesk frontDesk = new FrontDesk();

    public void getTowers(int guestId, int numberOfTowers) {
        String roomNumber = this.frontDesk.getRoomNumberFor(guestId);
        System.out.println("provide " + numberOfTowers + " to " + roomNumber);
    }
}
