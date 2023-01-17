package me.dingko.designpatterns._01_creational_patterns._02_factorymethod._011_before;

public class Client {
    public static void main(String[] args) {
        Ship whiteship = ShipFactory.orderShip("whiteship", "dingko_@email.com");
        System.out.println(whiteship);

        Ship blackship = ShipFactory.orderShip("blackship", "dingko_@email.com");
        System.out.println(blackship);
    }
}
