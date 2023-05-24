package me.dingko.designpatterns._01_creational_patterns._03_abstract._02_after;

/**
 * 추삭 팩토리(Abstract factory) 패턴
 *  - 서로 관련있는 여러 객체를 만들어주는 인터페이스
 *  - 구체적으로 어떤 클래스의 인스턴스(concrete product)를 사용하는지 감출 수 있다.
 *  - Client가 객체를 만들 때 인터페이스를 사용하도록 만들어주는 것이 Point -> 구체적인 타입에 의존하지 않도록
 *  - 팩토리 메서드 패턴의 구조에서 Client만 추가됨
 */
public class Client implements ShipFactory{

    //ShipPartsFactory의 인수를 받아서 이 객체를 이용하여 createShip() 메서드를 사용.
    //따라서, createShip() 메서드는 변화 없이 사용 가능
    private ShipPartsFactory shipPartsFactory;

    public Client(ShipPartsFactory shipPartsFactory) {
        this.shipPartsFactory = shipPartsFactory;
    }

    @Override
    public Ship createShip() {
        //TODO 구체적인 클래스에 의존하지 않도록 해야 한다.
        Ship ship = new Whiteship();
        ship.setAnchor(shipPartsFactory.createAnchor());
        ship.setWheel(shipPartsFactory.createWheel());
        return ship;
    }
}
