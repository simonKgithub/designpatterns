package me.dingko.book.commandpattern;

import me.dingko.book.commandpattern.command.Command;
import me.dingko.book.commandpattern.command.MacroCommand;
import me.dingko.book.commandpattern.drawer.ColorCommand;
import me.dingko.book.commandpattern.drawer.DrawCanvas;
import me.dingko.book.commandpattern.drawer.DrawCommand;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Main extends JFrame {
    //그리기 이력
    private MacroCommand history = new MacroCommand();
    //그리는 영역
    private DrawCanvas canvas = new DrawCanvas(400, 400, history);
    //삭제 버튼
    private JButton clearButton = new JButton("clear");
    //undo 버튼
    private JButton undoButton = new JButton("undo");
    //새로운 색 설정 버튼
    private JButton setColor = new JButton("색바꾸기");
    //빨간 버튼
    private JButton redButton = new JButton("red");
    //초록 버튼
    private JButton greenButton = new JButton("green");
    //파란 버튼
    private JButton blueButton = new JButton("blue");

    //생성자
    public Main(String title) {
        super(title);

        //clear 설정
        clearButton.addActionListener(e -> {
            history.clear();
            canvas.init();
            canvas.repaint();
        });

        //버튼 설정
        redButton.addActionListener(e -> {
            Command cmd = new ColorCommand(canvas, Color.red);
            history.append(cmd);
            cmd.execute();
        });
        greenButton.addActionListener(e -> {
            Command cmd = new ColorCommand(canvas, Color.green);
            history.append(cmd);
            cmd.execute();
        });
        blueButton.addActionListener(e -> {
            Command cmd = new ColorCommand(canvas, Color.blue);
            history.append(cmd);
            cmd.execute();
        });

        //undo 설정
        undoButton.addActionListener(e -> {
            history.undo();
            canvas.repaint();
        });

        //색 설정
        setColor.addActionListener(e -> {

        });

        //드래그설정
        canvas.addMouseMotionListener(new MouseMotionAdapter() {
            @Override
            public void mouseDragged(MouseEvent e) {
                Command cmd = new DrawCommand(canvas, e.getPoint());
                history.append(cmd);
                cmd.execute();
            }
        });
        //window 종료 설정
        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

        Box buttonBox = new Box(BoxLayout.X_AXIS);
        buttonBox.add(clearButton);
        buttonBox.add(undoButton);
        buttonBox.add(redButton);
        buttonBox.add(greenButton);
        buttonBox.add(blueButton);
        Box mainBox = new Box(BoxLayout.Y_AXIS);
        mainBox.add(buttonBox);
        mainBox.add(canvas);
        getContentPane().add(mainBox);

        pack();
        setVisible(true);
    }
    public static void main(String[] args) {
        new Main("Command Pattern Sample");
    }
}
