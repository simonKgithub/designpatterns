package me.dingko.designpatterns._01_creational_patterns._03_abstract._01_before;

public interface ShipFactory {
    default Ship orderShip(String name, String email) {
        validate(name, email);
        prefareFor(name);
        Ship ship = createShip();
        sendEmailTo(email, ship);

        return ship;
    }

    Ship createShip();

    private void sendEmailTo(String email, Ship ship){
        System.out.println(ship.getName() + " 생성 완료되었습니다.");
    };

    private void prefareFor(String name){
        System.out.println(name + " 배 생성이 시작되었습니다.");
    };

    private void validate(String name, String email){
        if (name == null || name.isEmpty()) {
            throw new IllegalArgumentException("배 이름을 지어주세요");
        }
        if (email == null || email.isEmpty()) {
            throw new IllegalArgumentException("연락저를 남겨주세요");
        }
    };
}