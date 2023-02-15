package me.dingko.book.flyweight;

import java.util.HashMap;
import java.util.Map;

public class BigCharFactory {
    //이미 만든 BigChar 인스턴스를 관리
    private Map<String, BigChar> pool = new HashMap<>();
    //Singleton 패턴
    private static BigCharFactory singleton = new BigCharFactory();

    //생성자
    private BigCharFactory(){}

    //유일한 인스턴스를 얻는다.(static 영역에 있으므로, 이미 compile되면서 올라가 있음. 공용에서 불러오게 됨)
    public static BigCharFactory getInstance() {
        return singleton;
    }

    //BigChar 인스턴스 생성(및 공유)
    public synchronized BigChar getBigChar(char charname) {
        BigChar bc = pool.get(String.valueOf(charname));
        if (bc == null) {
            //pool에 없는 charname이라면, BigChar의 인스턴스를 생성한다.
            bc = new BigChar(charname);
            pool.put(String.valueOf(charname), bc);
        }
        return bc;
    }
}
