package me.dingko.book.memento.game;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;

public class Memento {
    private int money; //소지금
    private List<String> fruits; //과일
    private int number;

    //wide interface
    Memento(int money) {
        this.money = money;
        this.fruits = new ArrayList<>();
    }

    //wide interface
    void addFruit(String fruit) {
        fruits.add(fruit);
    }

    //narrow interface
    public int getMoney() {
        return money;
    }

    //wide interface
    public List<String> getFruits() {
        return fruits;
    }

    int getNumber() {
        return number;
    }

    //파일에 저장
    public static boolean saveToFile(String filename, Memento memento) {
        StringBuilder sb = new StringBuilder();

        //소지금
        sb.append(String.format("%d", memento.money));
        sb.append("\n");

        //과일
        for (String f : memento.getFruits()) {
            sb.append(f);
            sb.append("\n");
        }

        //쓰기
        try {
            Files.writeString(Path.of(filename), sb,
                    StandardOpenOption.CREATE,
                    StandardOpenOption.TRUNCATE_EXISTING,
                    StandardOpenOption.WRITE);
        } catch (IOException e) {
            System.out.println(e.toString());
            return false;
        }
        return true;
    }

    //파일로부터 생성
    public static Memento loadFromFile(String filename) {
        try {
            //읽기
            List<String> lines = Files.readAllLines(Path.of(filename));
            if (lines.size() == 0) {
                System.out.println("Empty file");
                return null;
            }

            //소지금
            int money = 0;
            try {
                money = Integer.parseInt(lines.get(0));
            } catch (NumberFormatException e) {
                System.out.println("Format error : " + e);
                return null;
            }

            //생성
            Memento memento = new Memento(money);

            //과일
            for (int i = 1; i < lines.size(); i++) {
                memento.addFruit(lines.get(i));
            }
            return memento;
        } catch (IOException e) {
            System.out.println(e.toString());
            return null;
        }
    }
}
