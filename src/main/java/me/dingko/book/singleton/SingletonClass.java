package me.dingko.book.singleton;

public class SingletonClass {
    private static SingletonClass singletonClass = null;

    private SingletonClass(){
        System.out.println("인스턴스를 생성하였습니다.");
    }

    public static SingletonClass getInstance() {
        if (singletonClass == null) {
            singletonClass = new SingletonClass();
        }
        return singletonClass;
    }
}
