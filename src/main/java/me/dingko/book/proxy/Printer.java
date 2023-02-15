package me.dingko.book.proxy;

public class Printer implements Printable{
    private String name;//이름

    //생성자
    public Printer(){
        heavyJob("Printer 인스턴스 생성중");
    }
    //생성자(이름 지정)
    public Printer(String name) {
        this.name = name;
        heavyJob("Printer 인스턴스("+ name +") 생성중");
    }
    //무거운 작업이라고 가정
    private void heavyJob(String msg) {
        System.out.print(msg);
        for (int i = 0; i < 5; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.print(".");
        }
        System.out.println("완료");
    }

    @Override
    public void setPrintName(String name) {
        this.name = name;
    }

    @Override
    public String getPrintName() {
        return this.name;
    }

    @Override
    public void print(String string) {
        System.out.println("=== "+ name +" ===");
        System.out.println(string);
    }
}
