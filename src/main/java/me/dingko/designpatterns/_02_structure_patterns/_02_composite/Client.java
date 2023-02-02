package me.dingko.designpatterns._02_structure_patterns._02_composite;

public class Client {
    public static void main(String[] args) {
        Item nife = new Item("검", 450);
        Item potion = new Item("물약", 50);

        Bag bag = new Bag();
//        bag.add(nife);
//        bag.add(potion);

        Client client = new Client();
        client.printPrice(nife); //아이템의 가격 출력
        client.printPrice(bag); // bag에 있는 모든 item의 가격 출력
    }

    private void printPrice(Item item) {
        System.out.println(item.getPrice());
    }
    private void printPrice(Bag bag) {
//       int sum = bag.getItems().stream().mapToInt(Item::getPrice).sum();
//        System.out.println(sum);
    }
}
