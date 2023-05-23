package me.dingko.designpatterns._01_creational_patterns._02_factorymethod._01_before;

/**
 * 팩토리 메서드 패턴: 구체적으로 어떤 인스턴스를 만들지는 서브 클래스가 정한다.
 *  - 다양한 구현체(Product)가 있고, 그 중에서 특정한 구현제를 만들 수 있는 다양한 팩토리(Creator)를 제공할 수 있다.
 *  - 어떤 인스턴스를 생성하는 책임을 추상적인 인터페이스의 메서드로 감싸는 것
 *  - 인터페이스 안에 기본적인 구현이 있고, 일부 바뀌어야 되는 부분을 추상메서드로 빼 내어 하위 클래스에서 구현을 하도록 하는 것
 */
public class Client {
    public static void main(String[] args) {
        Client client = new Client();

        Ship whiteship = ShipFactory.orderShip("Whiteship", "dingko@mail.com");
        System.out.println(whiteship);

        Ship blackship = ShipFactory.orderShip("Blackship", "dingko@mail.com");
        System.out.println(blackship);
    }
}
