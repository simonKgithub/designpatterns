package me.dingko.book.properties;

import java.util.Properties;

public class PropertiesEx4 {
    public static void main(String[] args) {
        Properties sysProp = System.getProperties();
        sysProp.list(System.out);
    }
}
