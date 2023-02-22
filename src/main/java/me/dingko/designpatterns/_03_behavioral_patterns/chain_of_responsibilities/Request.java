package me.dingko.designpatterns._03_behavioral_patterns.chain_of_responsibilities;

public class Request {
    private String body;

    public Request(String body) {
        this.body = body;
    }

    public String getBody() {
        return this.body;
    }
}
