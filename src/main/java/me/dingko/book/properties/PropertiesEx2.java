package me.dingko.book.properties;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.Properties;

public class PropertiesEx2 {
    public static void main(String[] args) {
        Properties prop = new Properties();

        try{
            prop.load(new FileInputStream("input.txt"));
        } catch(IOException e){
            System.out.println("지정된 파일을 찾을 수 없습니다.");
            e.printStackTrace();
        }

        String name = prop.getProperty("name");
        String[] data = prop.getProperty("data").split(",");
        String kr = prop.getProperty("kr");

        //한글 깨짐 방지
        try {
            kr = new String(kr.getBytes("8859_1"), "UTF-8");
        } catch (Exception e) {}

        System.out.println("name = " + name);
        System.out.println("data = " + Arrays.toString(data));
        System.out.println("kr = " + kr);
    }
}

