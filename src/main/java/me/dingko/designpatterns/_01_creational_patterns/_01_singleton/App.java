package me.dingko.designpatterns._01_creational_patterns._01_singleton;

/**
 * 싱클톤(Singleton)패턴 - 인스턴스를 오직 한개만 제공하는 클래스
 *  시스템 런타임, 환경 세팅에 대한 정보 등, 인스턴스가 여러개 일 때 문제가 생길 수 있는 경우가 있다.
 *  인스턴스를 오직 한개만 만들어 제공하는 클래스가 필요하다.
 */
public class App {
    public static void main(String[] args) {

        Settings instance1 = Settings.getInstance();
        Settings instance2 = Settings.getInstance();
        System.out.println(instance1 == instance2);

    }
}
