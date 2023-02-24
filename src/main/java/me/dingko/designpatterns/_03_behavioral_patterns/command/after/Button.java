package me.dingko.designpatterns._03_behavioral_patterns.command.after;

import me.dingko.designpatterns._03_behavioral_patterns.command.Game;
import me.dingko.designpatterns._03_behavioral_patterns.command.Light;

import java.util.Stack;

public class Button {
    //행동을 기록할 스택
    private Stack<Command> commands = new Stack<>();

    public void press(Command command){
        command.execute();
        //스택에 쌓아줌
        commands.push(command);
    }

    public void undo(){
        if (!commands.isEmpty()) {
            Command command = commands.pop();
            command.undo();
        }
    }

    public static void main(String[] args) {
        Button button = new Button();
        button.press(new GameStartCommand(new Game()));
        button.press(new LightOnCommand(new Light()));
        button.undo();
        button.undo();
    }
}
