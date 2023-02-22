package me.dingko.designpatterns._03_behavioral_patterns.chain_of_responsibilities;

public class LoggingRequestHandler extends RequestHandler {
    @Override
    public void handle(Request request) {
        //로깅
        System.out.println("로깅");
        //처리
        super.handle(request);
    }
}
