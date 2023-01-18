package me.dingko.designpatterns._01_creational_patterns._03_abstract._01_before;

public class WhiteshipFactory implements ShipFactory {
    @Override
    public Ship createShip() {
        Ship ship = new Whiteship();
        ship.setAnchor(new WhiteAnchor());
        ship.setWheel(new WhiteWheel());
        return ship;
    }
}
