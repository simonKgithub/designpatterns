package me.dingko.designpatterns._03_behavioral_patterns.observer.after;

public class Client {
    public static void main(String[] args) {
        ChatServer chatServer = new ChatServer();
        User user1 = new User("user1");
        User user2 = new User("user2");

        //인강에 관심있는 user1, user2
        chatServer.register("인강", user1);
        chatServer.register("인강", user2);

        //디자인 패턴에 관심있는 user1
        chatServer.register("디자인패턴", user1);

        chatServer.sendMessage(user1, "인강", "오늘은 어떤 인강을 들어볼까?");
        chatServer.sendMessage(user2, "디자인패턴", "옵저버 패턴으로 만든 채팅");
    }
}
