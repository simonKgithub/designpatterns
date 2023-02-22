package me.dingko.book.commandpattern.drawer;

import me.dingko.book.commandpattern.command.MacroCommand;

import java.awt.*;

public class DrawCanvas extends Canvas implements Drawable{
    //그리는 색
    private Color color;
    //그리는 점의 반경
    private int radius;
    //이력
    private MacroCommand history;

    //생성자
    public DrawCanvas(int width, int height, MacroCommand history) {
        setSize(width, height);
        setBackground(Color.white);
        this.history = history;
        init();
    }

    //이력 전체 다시 그리기
    @Override
    public void paint(Graphics g) {
        history.execute();
    }

    @Override
    public void init() {
        color = Color.red;
        radius = 6;
        history.append(new ColorCommand(this, color));
    }

    //그리기
    @Override
    public void draw(int x, int y) {
        Graphics g = getGraphics();
        g.setColor(color);
        g.fillOval(x - radius, y - radius, radius * 2, radius * 2);
    }

    @Override
    public void setColor(Color color) {
        this.color = color;
    }
}
