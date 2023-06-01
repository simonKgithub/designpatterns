package me.dingko.designpatterns._02_structure_patterns._02_composite;

/**
 * 컴포짓 패턴
 *  - 트리 구조를 구현해야하는 패턴
 *  - 그룹 전체와 개별 객체를 동일하게 처리할 수 있는 패턴
 *  - 클라이언트 입장에서는 '전체' 나 '부분' 이나 모두 동일한 컴포넌트로 인식할 수 있는 계층구조를 만든다. (Part-Whole Hierarchy)
 *  - Component 라는 공통의 인터페이스를 정의한다.
 *      장점)
 *          1) 복잡한 트리 구조를 편리하게 사용할 수 있다.
 *          2) 다형성과 재귀를 활용할 수 있다.
 *          3) 클라이언트 코드를 변경하지 않고 새로운 엘리먼트 타입을 추가할 수 있다.
 *      단점)
 *          1) 트리를 만들어야 하기 때문에 (공통된 인터페이스를 정의해야 하기 때문에) 지나치게 일반화해야 하는 경우도 생길 수 있다.
 */
public class Client {
    public static void main(String[] args) {
        Item knife = new Item("검", 450);
        Item potion = new Item("물약", 50);
        Item potion2 = new Item("물약2", 70);
        Item potion3 = new Item("물약3", 80);

        Bag bag = new Bag();

        bag.add(knife);
        bag.add(potion);
        bag.add(potion2);
        bag.add(potion3);

        Client client = new Client();
        client.printPrice(knife);
        client.printPrice(bag);
    }

    private void printPrice(Component component) {
        int price = component.getPrice();
        System.out.println("price = " + price);
    }


//    private void printPrice(Bag bag) {
//        int sum = bag.getItems().stream().mapToInt(Item::getPrice).sum();
//        System.out.println(sum);
//    }

//    private void printPrice(Item knife) {
//        System.out.println(knife.getPrice());
//    }

}
