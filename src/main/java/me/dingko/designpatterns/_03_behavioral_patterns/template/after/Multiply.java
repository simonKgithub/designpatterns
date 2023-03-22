package me.dingko.designpatterns._03_behavioral_patterns.template.after;

public class Multiply { // extends FileProcessor{
//    public Multiply(String path) {
//        super(path);
//    }

    protected int getResult(int result, int line) {
        if(result == 0) result = 1;
        return result *= line;
    }
}
