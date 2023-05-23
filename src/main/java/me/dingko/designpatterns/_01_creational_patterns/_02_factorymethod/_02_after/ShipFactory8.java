package me.dingko.designpatterns._01_creational_patterns._02_factorymethod._02_after;

public interface ShipFactory8 {

    default Ship orderShip(String name, String email) {
        validate(name, email);      //유효성 검증
        prepareFor(name);           //배 만들 준비
        Ship ship = createShip();   //배 만듦
        sendEmailTo(email, ship);   //완성 연락
        return ship;
    }

    Ship createShip();

    void validate(String name, String email);
    void prepareFor(String name);
    void sendEmailTo(String email, Ship ship);
}
