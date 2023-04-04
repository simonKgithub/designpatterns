package me.dingko.book.factorymethod.idcard;

import me.dingko.book.factorymethod.framework.Factory;
import me.dingko.book.factorymethod.framework.Product;

public class IDCardFactory extends Factory {
    private int serial = 100;

    @Override
    protected synchronized Product createProduct(String owner) {
        return new IDCard(owner, serial++);
    }

    @Override
    protected void registerProduct(Product p) {
        System.out.println(p + "을 등록했습니다.");
    }
}
