package Phone;

public class Iphone {

    int useCount = 0; //사용 횟수

    public void applePay() {
        this.useCount += 1; //사용 시 누적됩니다.
    }
    public void airPods() {
        this.useCount += 1;
    }
}
