package me.dingko.designpatterns._01_creational_patterns._02_factorymethod._022_after;

public class Client {
    public static void main(String[] args) {
        Client client = new Client();
        client.print(new WhiteshipFactory(), "Whiteship", "dingko@email.com");
        client.print(new BlackshipFactory(), "Blackship", "dingko@email.com");
    }

    private void print(ShipFactory shipFactory, String name, String email) {
        System.out.println(shipFactory.orderShip(name, email));
    }
}
