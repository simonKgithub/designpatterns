package me.dingko.designpatterns._03_behavioral_patterns.command.after;

public interface Command {
    public abstract void execute();

    public abstract void undo();
}
