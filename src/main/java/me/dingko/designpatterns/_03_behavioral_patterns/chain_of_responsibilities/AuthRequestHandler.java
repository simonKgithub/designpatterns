package me.dingko.designpatterns._03_behavioral_patterns.chain_of_responsibilities;

public class AuthRequestHandler extends RequestHandler {
    @Override
    public void handle(Request request) {
        //검증(인증/인가)
        System.out.println("인증이 되었나?");
        System.out.println("이 핸들러를 사용할 수 있는 유저인가?");
        //처리
        super.handle(request);
    }
}
