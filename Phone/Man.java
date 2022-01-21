package Phone;

public class Man {
    void Call() {}

    Iphone iphone = new Iphone(); // Man은 Iphone을 사용합니다.

    void useIphone(Iphone iphone){ // Man은 Iphone이 제공하는 공개 메서드를 사용합니다.
        iphone.applePay();
        iphone.airPods();
    }
}

