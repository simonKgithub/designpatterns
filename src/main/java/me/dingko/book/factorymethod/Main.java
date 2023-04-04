package me.dingko.book.factorymethod;

import me.dingko.book.factorymethod.framework.Factory;
import me.dingko.book.factorymethod.framework.Product;
import me.dingko.book.factorymethod.idcard.IDCardFactory;

public class Main {
    public static void main(String[] args) {
        Factory factory = new IDCardFactory();

        Product card1 = factory.create("dingko_1");
        Product card2 = factory.create("dingko_2");
        Product card3 = factory.create("dingko_3");

        card1.use();
        card2.use();
        card3.use();
    }
}
