package me.dingko.designpatterns._02_structure_patterns._05_facade._after;

public class Client {
    public static void main(String[] args) {
        //이메일 세팅 : host 작성
        EmailSettings emailSettings = new EmailSettings();
        emailSettings.setHost("127.0.0.1");

        //이메일 센더 생성 : host 주입
        EmailSender emailSender = new EmailSender(emailSettings);

        //이메일 메시지 생성 : 넣을 메시지 작성
        EmailMessage emailMessage = new EmailMessage();
        emailMessage.setFrom("person");
        emailMessage.setTo("dingko_");
        emailMessage.setCc("dingko_2");
        emailMessage.setSubject("관상");
        emailMessage.setText("누가 왕이 될 상인가?");

        //이메일 샌더에 주입
        emailSender.sendEmail(emailMessage);
    }
}
