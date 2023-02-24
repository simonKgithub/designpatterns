package me.dingko.designpatterns._03_behavioral_patterns.command;

public class Button {
    private Light light;

    public Button(Light light) {
        this.light = light;
    }

    public void press(){
        light.off();
    }

    public static void main(String[] args) {
        Button button = new Button(new Light());
        button.press();
        button.press();
        button.press();
    }
}
