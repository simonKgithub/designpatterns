package me.dingko.book.proxy;

public class PrinterProxy implements Printable{
    private String name;//이름
    private Printable real;//'본인'
    private String className; //본인의 클래스 이름

    //생성자(이름지정)
    public PrinterProxy(String name, String className) {
        this.name = name;
        this.className = className;
    }

    @Override
    public synchronized void setPrintName(String name) {
        if (real != null) {
            //'본인'에게도 설정한다.
            real.setPrintName(name);
        }
        this.name = name;
    }

    @Override
    public String getPrintName() {
        return name;
    }

    @Override
    public void print(String string) {
        realize();
        real.print(string);
    }
    //본인생성
    private synchronized void realize() {
        if (real == null) {
            try{
                real = (Printable) Class.forName(className).getDeclaredConstructor().newInstance();
                real.setPrintName(name);
            } catch (ClassNotFoundException e) {
                System.out.println("클래스 " + className + "가 발견되지 않았습니다.");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
