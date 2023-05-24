package me.dingko.designpatterns._01_creational_patterns._03_abstract._02_after;

/**
 * 추상 팩토리이다.
 */
public interface ShipPartsFactory {

    Anchor createAnchor();

    Wheel createWheel();

}
