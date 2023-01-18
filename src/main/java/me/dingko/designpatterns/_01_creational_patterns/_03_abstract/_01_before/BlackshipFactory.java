package me.dingko.designpatterns._01_creational_patterns._03_abstract._01_before;

public class BlackshipFactory implements ShipFactory {
    @Override
    public Ship createShip() {
        return new BlackShip();
    }
}
