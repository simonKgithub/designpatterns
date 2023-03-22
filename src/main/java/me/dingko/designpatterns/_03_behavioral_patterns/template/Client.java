package me.dingko.designpatterns._03_behavioral_patterns.template;

public class Client {
    public static void main(String[] args) {
        MultiplyFileProcessor fileProcessor = new MultiplyFileProcessor("number.txt");
        int result = fileProcessor.process();
        System.out.println(result);
    }
}
