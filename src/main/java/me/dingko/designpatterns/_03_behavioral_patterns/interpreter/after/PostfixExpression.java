package me.dingko.designpatterns._03_behavioral_patterns.interpreter.after;

import java.util.Map;

public interface PostfixExpression {
    int interpret(Map<Character, Integer> context);
}
