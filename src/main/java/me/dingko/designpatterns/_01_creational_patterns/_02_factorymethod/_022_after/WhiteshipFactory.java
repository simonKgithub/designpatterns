package me.dingko.designpatterns._01_creational_patterns._02_factorymethod._022_after;

public class WhiteshipFactory implements ShipFactory {
    @Override
    public Ship createShip() {
        return new Whiteship();
    }
}
