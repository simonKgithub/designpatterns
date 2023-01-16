package me.dingko.designpatterns._01_creational_patterns._01_singleton;

public class Settings2 {
    // 네 번째 방법 : double checked locking 사용하기
    // 이른 초기화의 단점을 보완(초기 생성 비용을 없애고, 필요로 하는 그 시점에 만들 수 있다)할 때 사용
    // syncronized / volatile 사용
    // syncronized 위치 : 메서드가 아니라 if 검사 후 붙여주면 기존의 syncronized 가 가지고 있던 성능 문제 개선
    private static volatile Settings2 instance;
    private Settings2(){}

    public static Settings2 getInstance() {
        if (instance == null) {
            synchronized (Settings2.class) {
                if (instance == null) {
                    instance = new Settings2();
                }
            }
        }
        return instance;

    }

    // 세 번째 방법 : 이른 초기화 사용하기
    // 해당 클래스가 로딩되는 시점에 static 필드들이 초기화가 되고, 이 때 미리 만들어 놓았기 때문에 멀티스레드에서 안전하다.
    // 단점은 "미리 만들었다"임. 만들어 놓고 쓰지 않거나 나중에 사용하게 될 경우, 처음에 초기화 비용이 발생하기 때문
//    private static final Settings2 INSTANCE = new Settings2();
//    private Settings2(){}
//
//    public static Settings2 getInstance() {
//        return INSTANCE;
//    }

    //    //두 번째 방법 : syncronized 키워드 사용하기 (멀티스레드에서는 안전하나, 동기화 처리에서 성능의 저하가 발생한다.)
//    private static Settings2 instance;
//    private Settings2(){}
//
//    public static synchronized Settings2 getInstance() {
//        if (instance == null) {
//            instance = new Settings2();
//        }
//        return instance;
//    }
//        //첫 번째 방법(멀티스레드 환경에서 안전한 코드가 아니다. getInstance() 호출이 거의 동시에 발생하는 경우가 있을 수 있음)
//    private static Settings2 instance;
//
//    private Settings2(){}
//
//    public static Settings2 getInstance() {
//        if (instance == null) {
//            instance = new Settings2();
//        }
//        return instance;
//    }
}
