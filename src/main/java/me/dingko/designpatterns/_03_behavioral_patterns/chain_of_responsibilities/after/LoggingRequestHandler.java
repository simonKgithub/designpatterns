package me.dingko.designpatterns._03_behavioral_patterns.chain_of_responsibilities.after;

public class LoggingRequestHandler extends RequestHandler{

    public LoggingRequestHandler(RequestHandler nextHandler) {
        super(nextHandler);
    }

    @Override
    public void handle(Request request) {
        System.out.println("로깅을 수행");
        super.handle(request);
    }
}
