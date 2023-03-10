package me.dingko.designpatterns._03_behavioral_patterns.mediator;

public class Hotel {
    public static void main(String[] args) {
        Guest guest = new Guest();
        guest.getTower(3);
        guest.dinner();

        Restaurant restaurant = new Restaurant();
        restaurant.clean();
    }
}
