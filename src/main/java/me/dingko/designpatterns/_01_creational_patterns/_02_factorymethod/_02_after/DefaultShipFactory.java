package me.dingko.designpatterns._01_creational_patterns._02_factorymethod._02_after;

public abstract class DefaultShipFactory implements ShipFactory8 {
    @Override
    public void validate(String name, String email) {
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("배 이름을 지어주세요.");
        }
        if (email == null || email.isBlank()) {
            throw new IllegalArgumentException("연락처를 남겨주세요.");
        }
    }
    @Override
    public void prepareFor(String name) {
        System.out.println(name + " 님이 배 만들기를 요청하였습니다.");
    }
    @Override
    public void sendEmailTo(String email, Ship ship) {
        System.out.println(ship.getName() + " 다 만들었습니다.");
    }
}
