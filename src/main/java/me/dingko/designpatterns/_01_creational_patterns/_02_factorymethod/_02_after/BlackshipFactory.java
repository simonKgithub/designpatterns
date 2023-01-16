package me.dingko.designpatterns._01_creational_patterns._02_factorymethod._02_after;

public class BlackshipFactory extends DefaultShipFactory {

    @Override
    public Ship createShip() {
        return new Blackship();
    }
}
