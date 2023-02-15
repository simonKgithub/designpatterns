package me.dingko.book.properties;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesUse1 {
    public static void main(String[] args) {
        Properties prop = new Properties();

        try {
            prop.load(new FileInputStream("test.properties"));
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println(prop.getProperty("test"));
    }
}
