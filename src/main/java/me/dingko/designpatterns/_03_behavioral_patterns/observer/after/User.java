package me.dingko.designpatterns._03_behavioral_patterns.observer.after;

public class User implements Subscriber{
    private String name;

    public User(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public void handleMessage(String message) {
        System.out.println(message);
    }
}
