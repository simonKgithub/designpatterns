package me.dingko.designpatterns._03_behavioral_patterns.visitor;

public class Client {
    public static void main(String[] args) {
        Shape rectangle = new Rectangle();
        rectangle.printTo(new Phone());
    }
}
