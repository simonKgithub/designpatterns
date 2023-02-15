package me.dingko.book.proxy;

public interface Printable {
    public void setPrintName(String string); //이름 설정
    public String getPrintName(); //이름 취득
    public void print(String string); //문자열 표시(프린트 아웃)
}
