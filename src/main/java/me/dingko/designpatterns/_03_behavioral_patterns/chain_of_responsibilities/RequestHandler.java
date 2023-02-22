package me.dingko.designpatterns._03_behavioral_patterns.chain_of_responsibilities;

public class RequestHandler {
    public void handle(Request request) {
        System.out.println(request.getBody());
    }
}
