package me.dingko.designpatterns._02_structure_patterns._02_composite;

public class Item implements Component{
    private String name;
    private int price;

    public Item(String name, int price) {
        this.name = name;
        this.price = price;
    }

    @Override //컴파일 타임에 인터페이스가 제공하는 메서드가 맞는지 확인하는 역할이므로 구현할 시에는 잘 써줘야 한다.
    public int getPrice() {
        return this.price;
    }
}

