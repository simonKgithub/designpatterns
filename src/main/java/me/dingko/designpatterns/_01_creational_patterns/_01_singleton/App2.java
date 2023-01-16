package me.dingko.designpatterns._01_creational_patterns._01_singleton;

public class App2 {
    public static void main(String[] args) {
        // 네 번째 방법 : double checked locking 사용하기
        // 기존에 이른 초기화를 개선하는 방법 (클래스 필요 시점에 생성 가능)
        // syncronized / volatile 사용
        // syncronized 사용 시점의 변경으로 성능의 저하 문제도 막을 수 있음
        Settings2 ins1 = Settings2.getInstance();
        Settings2 ins2 = Settings2.getInstance();
        System.out.println(ins1 == ins2);

        // 세 번째 방법 : 이른 초기화 사용하기
        // 클래스가 로딩되는 시점에 인스턴스를 초기화 해버리면된다. 단점은 로딩 될 때 미리 만들어져 나중에 사용하지 않는 경우 초기화 비용이 발생한다.
//        Settings2 ins1 = Settings2.getInstance();
//        Settings2 ins2 = Settings2.getInstance();
//        System.out.println(ins1 == ins2);

//        // 두 번째 방법 : syncronized 사용 (멀티스레드 환경에서 안전한 코드, but 동기화 처리하는 과정에서 성능의 저하가 발생할 수 있음)
//        Settings2 ins1 = Settings2.getInstance();
//        Settings2 ins2 = Settings2.getInstance();
//
//        System.out.println(ins1 == ins2);

//        // 첫 번째 방법 (멀티스레드 환경에서 안전한 코드가 아니다.)
//        Settings2 ins1 = Settings2.getInstance();
//        Settings2 ins2 = Settings2.getInstance();
//
//        System.out.println(ins1 == ins2);
    }
}
