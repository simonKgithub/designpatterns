package me.dingko.book.flyweight;

public class BigString {
    //'큰 문자'의 배열
    private BigChar[] bigChars;

    //생성자(인수 없음, 공유함)
    public BigString(String string) {
        this.initShared(string);
    }
    
    //생성자(인수로 공유할지 말지 지정)
    public BigString(String string, boolean shared) {
        if (shared) {
            initShared(string);
        } else {
            initUnshared(string);
        }
    }
    
    //공유하고 초기화
    private void initShared(String string){
        BigCharFactory factory = BigCharFactory.getInstance();
        bigChars = new BigChar[string.length()];
        for (int i = 0; i < bigChars.length; i++) {
            bigChars[i] = factory.getBigChar(string.charAt(i));
        }
    }

    //공유 안하고 초기화
    private void initUnshared(String string) {
        bigChars = new BigChar[string.length()];
        for (int i = 0; i < bigChars.length; i++) {
            bigChars[i] = new BigChar(string.charAt(i));
        }
    }

    //표시
    public void print(){
        for (BigChar bc : bigChars) {
            bc.print();
        }
    }
}
