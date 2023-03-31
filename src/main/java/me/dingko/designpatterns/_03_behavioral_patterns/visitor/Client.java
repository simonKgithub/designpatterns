package me.dingko.designpatterns._03_behavioral_patterns.visitor;

public class Client {
    public static void main(String[] args) {
        Shape rectangle = new Rectangle();
        Device device = new Phone();
        rectangle.printTo(device);
    }
}
