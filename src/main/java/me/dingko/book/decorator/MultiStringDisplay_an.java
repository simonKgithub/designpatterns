package me.dingko.book.decorator;

import java.util.ArrayList;
import java.util.List;

public class MultiStringDisplay_an extends Display{
    private List<String> body = new ArrayList<>(); //표시 문자열 저장 장소

    private int columns = 0; //표시 문자열 최대 문자 수

    public void add(String msg) { //문자열 추가
        body.add(msg);
        if (columns < msg.length()) {
            columns = msg.length(); //최대 문자 수 갱신
        }
        updatePadding();
    }

    private void updatePadding() {
        for (int row = 0; row < body.size(); row++) {
            String line = body.get(row);
            int padding = columns - line.length();
            if (padding > 0) {
                body.set(row, line + spaces(padding));
            }
        }
    }

    private String spaces(int count) { // count의 수 만큼 공백을 만든다
        StringBuilder spaces = new StringBuilder();
        for (int i = 0; i < count; i++) {
            spaces.append(' ');
        }
        return spaces.toString();
    }

    @Override
    public int getColumns() {
        return columns;
    }

    @Override
    public int getRows() {
        return body.size();
    }

    @Override
    public String getRowText(int row) {
        return body.get(row);
    }
}
