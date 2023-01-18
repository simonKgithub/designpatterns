package me.dingko.designpatterns._01_creational_patterns._03_abstract._02_after;

public class Client {
    public static void main(String[] args) {
        ShipFactory shipFactory = new WhiteshipFactory(new WhiteshipPartsFactory());
        Ship ship = shipFactory.createShip();
        System.out.println(ship.getAnchor());
        System.out.println(ship.getWheel());

        //Pro
        ShipFactory shipFactory2 = new WhiteshipFactory(new WhiteshipProPartsFactory());
        Ship ship2 = shipFactory2.createShip();
        System.out.println(ship2.getAnchor());
        System.out.println(ship2.getWheel());
    }
}
