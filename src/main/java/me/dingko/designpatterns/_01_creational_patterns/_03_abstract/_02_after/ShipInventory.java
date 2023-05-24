package me.dingko.designpatterns._01_creational_patterns._03_abstract._02_after;

/**
 * 이 클래스는 "외부"에 있는 클래스이다.
 * 밖에서 어떤 shipPartsFactory 를 넣어주냐에 따라서 Client 는 다른 ship part 를 조합한다.
 */
public class ShipInventory {

    public static void main(String[] args) {

        ShipFactory aShipFactory = new Client(new AShipPartsFactory());
        Ship aShip = aShipFactory.createShip();
        System.out.println(aShip.getAnchor().getClass());
        System.out.println(aShip.getWheel().getClass());

        ShipFactory bShipFactory = new Client(new BShipPartsFactory());
        Ship bShip = bShipFactory.createShip();
        System.out.println(bShip.getAnchor().getClass());
        System.out.println(bShip.getWheel().getClass());

    }

}
