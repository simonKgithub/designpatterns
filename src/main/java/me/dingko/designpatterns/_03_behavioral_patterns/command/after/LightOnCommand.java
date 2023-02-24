package me.dingko.designpatterns._03_behavioral_patterns.command.after;

import me.dingko.designpatterns._03_behavioral_patterns.command.Light;

public class LightOnCommand implements Command {

    private Light light;

    public LightOnCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.on();
    }

    @Override
    public void undo() {
        //불을 켜는 커맨드의 undo는 불을 끄는것
        new LightOffCommand(this.light).execute();
    }
}
