package me.dingko.designpatterns._03_behavioral_patterns.chain_of_responsibilities.after;

public abstract class RequestHandler {
    private RequestHandler nextHandler;

    public RequestHandler(RequestHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

    //요청 처리를 다음 핸들러로 위임
    public void handle(Request request) {
        if (nextHandler != null) {
            nextHandler.handle(request);
        }
    }
}
