package me.dingko.designpatterns._03_behavioral_patterns.command.after;

import me.dingko.designpatterns._03_behavioral_patterns.command.Light;

public class LightOffCommand implements Command{

    private Light light;

    public LightOffCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.off();
    }

    @Override
    public void undo() {
        //불을 끄는 커맨드의 undo는 불을 켜는 것
        new LightOnCommand(this.light).execute();
    }
}
