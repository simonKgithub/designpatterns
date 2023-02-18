package me.dingko.designpatterns._02_structure_patterns._06_flyweight.after;

public class Client {
    public static void main(String[] args) {
        FontFactory fontFactory = new FontFactory();
        Character h = new Character('h', "white", fontFactory.getFont("nanum:12"));
        Character e = new Character('h', "white", fontFactory.getFont("nanum:12"));
        Character l = new Character('h', "white", fontFactory.getFont("nanum:12"));
        Character l_2 = new Character('h', "white", fontFactory.getFont("nanum:12"));
        Character o = new Character('h', "white", fontFactory.getFont("nanum:12"));
    }
}
