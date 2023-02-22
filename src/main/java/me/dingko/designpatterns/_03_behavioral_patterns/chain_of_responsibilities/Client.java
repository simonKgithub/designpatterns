package me.dingko.designpatterns._03_behavioral_patterns.chain_of_responsibilities;

public class Client {
    public static void main(String[] args) {
        Request request = new Request("개나리 노란 꽃그늘 아래");
        RequestHandler requestHandler = new LoggingRequestHandler();
        requestHandler.handle(request);
    }
}
