package me.dingko.book.commandpattern.drawer;

import me.dingko.book.commandpattern.command.Command;

import java.awt.*;

public class ColorCommand implements Command {
    //그리기 대상
    protected Drawable drawable;
    //그리기 색
    private Color color;

    //생성자
    public ColorCommand(Drawable drawable, Color color) {
        this.drawable = drawable;
        this.color = color;
    }

    @Override
    public void execute() {
        drawable.setColor(color);
    }
}
