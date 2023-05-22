package me.dingko.designpatterns._01_creational_patterns._01_singleton;

public class Settings {

    /**
     * 4) (권장) static inner 클래스 사용하기
     *  멀티스레드에 안전 + Lazy loading 가능
     */
    private Settings(){}

    private static class SettingsHolder{
        private static final Settings INSTANCE = new Settings();
    }

    public static Settings getInstance() {
        return SettingsHolder.INSTANCE;
    }

    /**
     * 3) double checked locking 사용하기
     *  이른 초기화의 단점 x + synchronized 단점 x
     *  효율적인 동기화 블럭을 만들 수 있음
     *  + voletile 이라는 키워드를 써야 한다. (java 1.5 이상에서 사용을 해야하는 제약)

    private static volatile Settings instance;

    private Settings(){}

    public static Settings getInstance() {
        if (instance == null) { //인스턴스가 있는 경우에는 synchronized 메서드를 사용하지 않으므로 성능에 문제가 가지 않는다.
            synchronized (Settings.class) { //Settings의 class를 lock으로 사용
                if (instance == null) {
                    instance = new Settings();
                }
            }
        }
        return instance;
    }
     */

    /**
     * 2) 이른 초기화
     *  서버를 올릴 때 초기화를 시켜버린다.
     *  초기화 시 메모리 낭비가 심하지 않는 경우에 사용한다. (쓰지를 않는 경우에..)

    public static final Settings INSTANCE = new Settings();

    private Settings(){}

    public static Settings getInstance(){
        return INSTANCE;
    }
     */


    /**
     * 1) synchronized 사용하기
     *  동기화 처리 작업을 할 때 lock이 걸려 성능에 저하가 발생한다.

    private static Settings INSTANCE;

    private Settings(){}

    public static synchronized Settings getInstance(){
        if (INSTANCE == null) {
            INSTANCE = new Settings();
        }
        return INSTANCE;
    }
     */
}
