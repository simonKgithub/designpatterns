package me.dingko.designpatterns._01_creational_patterns._02_factorymethod._011_before;

public class ShipFactory {
    public static Ship orderShip(String name, String email) {
        //유효성 검증
        if (name == null || name.isEmpty()) {
            throw new IllegalArgumentException("배 이름을 지어주세요");
        }
        if (email == null || email.isEmpty()) {
            throw new IllegalArgumentException("연락처를 남겨주세요");
        }

        prepareFor(name);

        Ship ship = new Ship();
        ship.setName(name);

        // Customizing for specific name
        if (name.equalsIgnoreCase("whiteship")) {
            ship.setLogo("\uD83D\uDEE5️");
        } else if (name.equalsIgnoreCase("blackship")) {
            ship.setLogo("⚓");
        }

        // color
        if (name.equalsIgnoreCase("whiteship")) {
            ship.setColor("white");
        } else if (name.equalsIgnoreCase("blackship")) {
            ship.setColor("black");
        }

        // 알림
        sendEmailTo(email, ship);

        return ship;
    }

    private static void sendEmailTo(String email, Ship ship) {
        System.out.println(ship.getName() + " 완성하였습니다.");
    }

    private static void prepareFor(String name) {
        System.out.println(name + " 만들 준비 중");
    }
}