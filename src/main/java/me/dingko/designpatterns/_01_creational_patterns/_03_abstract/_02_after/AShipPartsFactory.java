package me.dingko.designpatterns._01_creational_patterns._03_abstract._02_after;

public class AShipPartsFactory implements ShipPartsFactory{
    @Override
    public Anchor createAnchor() {
        return new AAnchor();
    }

    @Override
    public Wheel createWheel() {
        return new AWheel();
    }
}
