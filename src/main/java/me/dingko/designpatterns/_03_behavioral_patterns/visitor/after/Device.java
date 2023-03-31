package me.dingko.designpatterns._03_behavioral_patterns.visitor.after;

public interface Device {
    void print(Triangle triangle);
    void print(Rectangle rectangle);
    void print(Circle circle);
}
