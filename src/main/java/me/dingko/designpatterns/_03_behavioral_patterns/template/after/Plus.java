package me.dingko.designpatterns._03_behavioral_patterns.template.after;

public class Plus implements Operator {
    @Override
    public int getResult(int result, int line) {
        return result += line;
    }
}
