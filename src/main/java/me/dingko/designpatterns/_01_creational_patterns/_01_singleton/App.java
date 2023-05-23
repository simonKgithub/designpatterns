package me.dingko.designpatterns._01_creational_patterns._01_singleton;

import java.io.*;
import java.lang.reflect.InvocationTargetException;

/**
 * 싱클톤(Singleton)패턴 - 인스턴스를 오직 한개만 제공하는 클래스
 *  시스템 런타임, 환경 세팅에 대한 정보 등, 인스턴스가 여러개 일 때 문제가 생길 수 있는 경우가 있다.
 *  인스턴스를 오직 한개만 만들어 제공하는 클래스가 필요하다.
 */
public class App {
    public static void main(String[] args) throws IOException, ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {

        /**
         * Q1. 자바에서 enum을 사용하지 않고 싱글톤 패턴을 구현하는 방법: static class or double lock
         * Q2. private 생성자와 static 메서드를 사용하는 방법의 단점은: 초기 생성
         * Q3. enum을 사용해서 싱글톤 패턴을 구현하는 방법의 장/단점: 싱글톤패턴을 깰 수 없다/초기 생성 + 상속 불가
         * Q4. static inner class 를 사용하여 싱글톤 패턴 구현하는 연습하기.
         */

        /**
         * 싱글톤 파괴막기 (2) 직렬화와 역직렬화
         * - 파괴 방지법: 이늄클래스 사용 - 이늄 클래스는 이미 Serializable 클래스를 구현함
         * - 이늄 클래스는 직렬화/역직렬화가 자동으로 된다.
         */
         Settings settings1 = Settings.getInstance();
         Settings settings2 = null;

         try (ObjectOutput out = new ObjectOutputStream(new FileOutputStream("settings.obj"))) {
         // 직렬화: 객체가 settings.obj 파일에 써짐(바이너리)
         out.writeObject(settings1);
         }

         try (ObjectInput in = new ObjectInputStream(new FileInputStream("settings.obj"))) {
         // 역직렬화: 파일을 객체로 불러옴, 이 때 다른 객체로 생성하여 다른 객체가 되어버림
         settings2 = (Settings) in.readObject();
         }

         System.out.println(settings1 != settings2);


        /**
         * 리플렉션을 적용한 싱글톤 파괴 방지
         *  - 파괴 방지법: 싱글톤 적용 클래스에서 이뉴머레이션 사용하기
         *  - 단점: 미리 만들어 진다.
         *  - 특징: 이늄은 기본적으로 Serializable을 구현하고 있다. 직렬화, 역직렬화에서도 사용 가능하다.

        Settings settings1 = Settings.INSTANCE;
        Settings settings2 = null;
        //기본 생성자를 못가져오기 때문에 전체 생성자 조회 후 돌면서 인스턴스 만드는 것을 시도해야한다.
//        Constructor<Settings> constructor = Settings.class.getDeclaredConstructor();
        Constructor<?>[] declaredConstructors = Settings.class.getDeclaredConstructors(); //모든 생성자 다 가져옴
        for (Constructor<?> constructor : declaredConstructors) {
            constructor.setAccessible(true);
            //Cannot reflectively create enum objects, 이늄은 리플렉션을 막았다.=> 유일한 인스턴스가 보장이 된다.
            settings2 = (Settings) constructor.newInstance("INSTANCE");
        }

        System.out.println(settings1 != settings2);
         */

        /**
         * 싱글톤 파괴 (2) 직렬화와 역직렬화
         *  오브젝트를 파일형태(직렬화)로 저장했다가 다시 읽어들일 때(역직렬화)
         *  Settings class에 Serializable 선언해줘야 직렬화, 역직렬화 가능
         *  - 파괴 방지법: 싱글톤 클래스에 protected Object getResolve() 메서드를 override하여 생성자를 유지시켜주면 된다.

        Settings settings1 = Settings.getInstance();
        Settings settings2 = null;

        try (ObjectOutput out = new ObjectOutputStream(new FileOutputStream("settings.obj"))) {
            // 직렬화: 객체가 settings.obj 파일에 써짐(바이너리)
            out.writeObject(settings1);
        }

        try (ObjectInput in = new ObjectInputStream(new FileInputStream("settings.obj"))) {
            // 역직렬화: 파일을 객체로 불러옴, 이 때 다른 객체로 생성하여 다른 객체가 되어버림
            settings2 = (Settings) in.readObject();
        }

        System.out.println(settings1 != settings2);
         */

        /**
         * 싱글톤 파괴 (1) 리플렉션 만들기
         *  - 파괴 방지법: 싱글톤 적용 클래스에서 이뉴머레이션 사용하기

        Settings settings1 = Settings.getInstance();
        Constructor<Settings> constructor = Settings.class.getDeclaredConstructor();
        constructor.setAccessible(true);
        Settings settings2 = constructor.newInstance();

        System.out.println(settings1 != settings2);
         */

        /**
         * 기본동작 (싱글톤 존재)
        Settings instance1 = Settings.getInstance();
        Settings instance2 = Settings.getInstance();
        System.out.println(instance1 == instance2);
         */

    }
}
