package me.dingko.designpatterns._01_creational_patterns._02_factorymethod._02_after;

/**
 * 기존 코드(ShipFactory, Ship, WhiteShip, WhiteShipFactory)를 변경하지 않고, BlackShipFactory, BlackShip 을 확장하였다.
 * 확장에 열려있고, 변경에 닫혀있는 OCP 원칙을 잘 지킴(Open Closed Principle)
 *
 * Q1. 팩토리 메서드 패턴을 적용했을 때의 장점/단점: 기존 코드의 변경이 없이 확장 가능 / 복잡성 증가
 * Q2. OCP 원칙: Open Closed Principle, 기존 코드는 변경되지 않고, 추가되는 코드는 확장 가능한 원칙
 * Q3. 자바8에 추가된 default 메서드에 대해 설명: 인터페이스 안에서 구체적인 메서드 바디를 만들 수 있는 기능
 */
public class Client {

    public static void main(String[] args) {

        /**
         * Client 코드의 의존관계를 느슨하게 만드는 코드
         */
        Client client = new Client();
        client.print(new WhiteShipFactory(), "dingko", "dingko_@naver.com");
        client.print(new BlackShipFactory(), "BlackDingko", "dingko_@naver.com");
        client.defaultPrint(new WhiteShipFactory8(), "dingko2", "dingko2@naver.com");
        /**
         * 기존 코드

        // ctrl + alt + N
        Ship whiteShip = new WhiteShipFactory().orderShip("dingko", "dingko_@naver.com");
        System.out.println("whiteShip = " + whiteShip);

        Ship blackShip = new BlackShipFactory().orderShip("blackDingko", "blackDingko_@naver.com");
        System.out.println("blackShip = " + blackShip);
         */
    }

    //이 코드도 절대 바뀌지 않는다.
    private void defaultPrint(DefaultShipFactory defaultShipFactory, String name, String email) {
        System.out.println(defaultShipFactory.orderShip(name,email));
    }

    //이 코드는 절대 바뀌지 않는다.
    private void print(ShipFactory shipFactory, String name, String email) {
        System.out.println(shipFactory.orderShip(name, email));
    }
}
