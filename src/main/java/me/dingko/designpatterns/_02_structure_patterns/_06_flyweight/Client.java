package me.dingko.designpatterns._02_structure_patterns._06_flyweight;

public class Client {
    public static void main(String[] args) {
        Character h = new Character('h', "white", "Nanum", 12);
        Character e = new Character('e', "white", "Nanum", 12);
        Character l = new Character('l', "white", "Nanum", 12);
        Character l_2 = new Character('l', "white", "Nanum", 12);
        Character o = new Character('o', "white", "Nanum", 12);
    }
}
