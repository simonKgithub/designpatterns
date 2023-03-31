package me.dingko.designpatterns._03_behavioral_patterns.visitor.after;

public class Phone implements Device {
    @Override
    public void print(Triangle triangle) {
        System.out.println("triangle to Phone = " + triangle);
    }

    @Override
    public void print(Rectangle rectangle) {
        System.out.println("rectangle to Phone = " + rectangle);
    }

    @Override
    public void print(Circle circle) {
        System.out.println("circle to Phone = " + circle);
    }
}
