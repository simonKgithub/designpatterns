package me.dingko.designpatterns._01_creational_patterns._03_abstract._02_after;

public class BShipPartsFactory implements ShipPartsFactory{
    @Override
    public Anchor createAnchor() {
        return new BAnchor();
    }

    @Override
    public Wheel createWheel() {
        return new BWheel();
    }
}
