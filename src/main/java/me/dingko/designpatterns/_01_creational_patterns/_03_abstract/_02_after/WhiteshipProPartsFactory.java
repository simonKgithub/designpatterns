package me.dingko.designpatterns._01_creational_patterns._03_abstract._02_after;

public class WhiteshipProPartsFactory implements ShipPartsFactory{

    @Override
    public Anchor createAnchor() {
        return new WhiteAnchorPro();
    }

    @Override
    public Wheel createWheel() {
        return new WhiteWheelPro();
    }
}
