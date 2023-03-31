package me.dingko.designpatterns._03_behavioral_patterns.visitor.after;

public class Circle implements Shape {
    @Override
    public void accept(Device device) {
        device.print(this);
    }
}
