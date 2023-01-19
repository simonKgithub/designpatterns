package me.dingko.designpatterns._01_creational_patterns._02_factorymethod._01_before;

public class Client {
    public static void main(String[] args) {
        Client client = new Client();

        Ship whiteship = ShipFactory.orderShip("Whiteship", "yeonse@mail.com");
        System.out.println(whiteship);

        Ship blackship = ShipFactory.orderShip("Blackship", "yeonse@mail.com");
        System.out.println(blackship);
    }
}
