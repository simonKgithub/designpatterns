package me.dingko.designpatterns._03_behavioral_patterns.chain_of_responsibilities.after;

public class PrintRequestHandler extends RequestHandler{

    public PrintRequestHandler(RequestHandler nextHandler) {
        super(nextHandler);
    }

    @Override
    public void handle(Request request) {
        //요청의 본문을 출력하는 핸들러
        System.out.println(request.getBody());
        super.handle(request);
    }
}
