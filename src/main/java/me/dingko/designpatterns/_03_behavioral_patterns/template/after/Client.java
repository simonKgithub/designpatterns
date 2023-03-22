package me.dingko.designpatterns._03_behavioral_patterns.template.after;

public class Client {
    public static void main(String[] args) {
        FileProcessor fileProcessor = new FileProcessor("number.txt");
        int result = fileProcessor.process(new Operator() {
            @Override
            public int getResult(int result, int line) {
                return result += line;
            }
        });
        System.out.println(result);
    }
}
