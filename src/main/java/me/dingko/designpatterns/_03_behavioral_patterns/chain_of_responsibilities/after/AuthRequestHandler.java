package me.dingko.designpatterns._03_behavioral_patterns.chain_of_responsibilities.after;

public class AuthRequestHandler extends RequestHandler{

    public AuthRequestHandler(RequestHandler nextHandler) {
        super(nextHandler);
    }

    @Override
    public void handle(Request request) {
        System.out.println("인증이 되었는지 확인하는 프로세스");
        super.handle(request);
    }
}
