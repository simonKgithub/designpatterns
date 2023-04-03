package me.dingko.book.singleton;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Triple {
    private static Map<String, Triple> map = new HashMap<>();
    private String name;

    static{
        String[] names = {"ALPHA", "BETA", "GAMMA"};
        Arrays.stream(names).forEach(s -> map.put(s, new Triple(s)));
    }

    private Triple(String name) {
        System.out.println("The Instance " + name + " is created.");
        this.name = name;
    }

    public static Triple getInstance(String name) {
        return map.get(name);
    }

    @Override
    public String toString() {
        return this.name;
    }
}
