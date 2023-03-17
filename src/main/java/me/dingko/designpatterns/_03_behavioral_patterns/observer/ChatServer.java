package me.dingko.designpatterns._03_behavioral_patterns.observer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ChatServer {
    //메세지의 주제(subject)와 내용(message)를 담는 속성
    private Map<String, List<String>> messages;

    public ChatServer() {
        this.messages = new HashMap<>();
    }

    public void add(String subject, String message) {
        //기존에 존재하는 주제면, 해당 subject에 내용을 추가한다.
        if (messages.containsKey(subject)) {
            messages.get(subject).add(message);
        } else {
            //새로 생긴 주제면 새로 만들어서 messages에 추가한다.
            List<String> messageList = new ArrayList<>();
            messageList.add(message);
            messages.put(subject, messageList);
        }
    }

    public List<String> getMessage(String subject) {
        return messages.get(subject);
    }
}