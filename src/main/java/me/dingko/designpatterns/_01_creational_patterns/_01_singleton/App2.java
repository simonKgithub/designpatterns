package me.dingko.designpatterns._01_creational_patterns._01_singleton;

import java.io.*;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class App2 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {

        // 싱글톤 깨기 2) : 직렬화와 역직렬화 (readResolve() 추가 or Settings2 클래스 enum 선언)
        Settings2 ins1 = Settings2.INSTANCE;
        Settings2 ins2 = null;

        //직렬화
        try (ObjectOutput out = new ObjectOutputStream(new FileOutputStream("settings2.obj"))) {
            out.writeObject(ins1);
        }

        //역직렬화
        try(ObjectInput in = new ObjectInputStream(new FileInputStream("settings2.obj"))){
            ins2 = (Settings2) in.readObject();
        }

        System.out.println(ins1 == ins2);


        // 싱글톤 깨기 1) : 리플렉션 사용하여 싱글톤 깨기
//        Settings2 ins1 = Settings2.INSTANCE;
//        Constructor<?>[] constructor = Settings2.class.getDeclaredConstructors();
//        constructor[0].setAccessible(true);
//        Settings2 ins2 = (Settings2) constructor[0].newInstance();
//        System.out.println(ins1 == ins2);


        // 다섯 번째 방법 : static inner 클래스 사용하기
//        Settings2 ins1 = Settings2.getInstance();
//        Settings2 ins2 = Settings2.getInstance();
//        System.out.println(ins1 == ins2);

        // 네 번째 방법 : double checked locking 사용하기
        // 기존에 이른 초기화를 개선하는 방법 (클래스 필요 시점에 생성 가능)
        // syncronized / volatile 사용
        // syncronized 사용 시점의 변경으로 성능의 저하 문제도 막을 수 있음
//        Settings2 ins1 = Settings2.getInstance();
//        Settings2 ins2 = Settings2.getInstance();
//        System.out.println(ins1 == ins2);

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
