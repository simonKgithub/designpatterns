package me.dingko.designpatterns._03_behavioral_patterns.visitor.after;

public class Pad implements Device{
    @Override
    public void print(Triangle triangle) {
        System.out.println("triangle to Pad = " + triangle);
    }

    @Override
    public void print(Rectangle rectangle) {
        System.out.println("rectangle to Pad = " + rectangle);
    }

    @Override
    public void print(Circle circle) {
        System.out.println("circle to Pad = " + circle);
    }
}
