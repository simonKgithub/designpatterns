package me.dingko.designpatterns._01_creational_patterns._02_factorymethod._02_after;

public interface ShipFactory {

    default Ship orderShip(String name, String email) {
        validate(name, email);      //유효성 검증
        prepareFor(name);           //배 만들 준비
        Ship ship = createShip();   //배 만듦
        sendEmailTo(email, ship);   //완성 연락
        return ship;
    }

    Ship createShip();

    private void validate(String name, String email) {
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("배 이름을 지어주세요.");
        }
        if (email == null || email.isBlank()) {
            throw new IllegalArgumentException("연락처를 남겨주세요.");
        }
    }
    private static void prepareFor(String name) {
        System.out.println(name + " 님이 배 만들기를 요청하였습니다.");
    }
    private static void sendEmailTo(String email, Ship ship) {
        System.out.println(ship.getName() + " 다 만들었습니다.");
    }
}
