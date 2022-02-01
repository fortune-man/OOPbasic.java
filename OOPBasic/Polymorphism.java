package OOPBasic;

class Product {
    int price; // 제품 가격

    Product(int price) { // 생성자
        this.price = price;
    }
}

class Television extends Product{
    Television() { // 부모 클래스의 생성자 호출
        super(100); // super = 부모클래스의 this
    }
    @Override
    public String toString(){
        //Object 클래스의 toString()을 오버라이딩
        return "TV";
    }
}

class Computer extends Product{
    Computer(){
        super(200);
    }
    public String toString(){
    return "Computer";
    }
}

class Buyer {
    int money = 1000; // 소유 금액
    void buy(Product p) {
        // 매개 변수가 Product 타입의 참조변수. Product 클래스의 자손 클래스 Tv, Computer의 참조변수를 한번에 매개변수로 받아들일 수 있습니다.
        // 앞으로 다른 제품 클래스를 추가할 때 Product클래스를 상속받기만 하면, buy(Product  p)메서드의 매개변수로 받아들여질 수 있습니다.
        if (money < p.price) {
            System.out.println("잔액이 부족합니다");
            return;
        }
        money -= p.price; // 잔액 - 가격
    }
}

public class Polymorphism {
    public static void main(String[] args) {
        Buyer b = new Buyer();
        Television tv = new Television();
        Computer computer = new Computer();

        b.buy(tv);
        b.buy(computer);

        System.out.println("잔액 = " + b.money);
    }
}
