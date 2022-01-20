# OOPbasic.java

클래스와 인스턴스
클래스: 객체 지향을 지원하는 프로그래밍 언어에서 객체 구현을 위해 지원하는 기능
인스턴스: 클래스가 복제된 데이터.
여러 상태의 클래스가 동시에 필요할 때 클래스 앞에 new를 붙여서 클래스의 복제본을 만들면 서로 다른 상태를 유지할 수 있다. 이것을 가르켜 클래스를 인스턴스화 한다고 한다.

public class User{}

User user1 = new User();
User user2 = new User();
System.out.println(user1 == user2);
-> false

속성과 메서드
속성
클래스의 속성(attriboute)은 클래스 내에 담기는 데이터들을 말하며 멤버 변수라고도 한다.
클래스의 속성은 크게 클래스 변수와 인스턴스 변수로 나눠볼 수 있다.

클래스 변수
클래스 자체에 정의되는 변수. 같은 클래스의 인스턴스들은 같은 클래스 변수값을 가지게 된다.

인스턴스 변수
인스턴스 별로 독립적으로 가질 수 있는 값

public class User {
    String id;
    String password;

    String login(String id, String password) {
        this.id = id;
        this.password = password;
        return  "id: " + id + "| password: " + password;
    }
}
public class Member {
    public static void main(String[] args) {
        String id = "enter id";
        String password = "password";

        User member = new User();
        User member1 = new User();
        User member2 = new User();

        //클래스 변수는 인스턴스화 하지 않아도 접근 가능
        System.out.println("member = " + member.id + "| " + member.password);
        
        //인스턴스화한 후에도 클래스 변수에 접근 가능
        System.out.println("member1 = " + member1.login(id, password));
        
        //서로 다른 인스턴스라도 클래스 변수는 공유 가능
        System.out.println("member2 = " + member2.login("AAA", "qwer"));
    }
}
메서드
메서드는 클래스가 가지고 있는 함수이자 객체가 할 수 있는 행위를 뜻한다.
크게 공개형(public)메서드와 비공개형(private) 메서드로 나눠볼 수 있다.

공개형(public) 메서드
공개형 메서드는 클래스 외부에서 사용할 수 있다

비공개형(private) 메서드
클래스 내부에서만 사용하는 메서드이다.
비공개형 메서드는 외부에서 접근하지 못하거나, 할 수 있더라도 하지 않는 게 관습이다. 공개형 메서드의 로직 일부를 내부적으로 재사용하거나, 의미를 분리하기 위해 사용하기 위한 목적으로 사용하곤 한다.

파이썬의 경우 자바와 다르게 접근 제어자가 없으나
변수나 메서드 이름 앞에 __를 붙임으로써 비공개 변수, 메서드를 명시하는게 관습이다.

인터페이스
인터페이스는 객체의 행위(메서드)만을 정의한 집합이다.

인터페이스 사용 이유
우리가 식당에 가서 음식을 주문한다고 상상해보자.
직원이 우리에게 음식을 조리해서 제공하는 행위를 하지만
손님인 우리들은 직원이 어떻게 음식을 조리해서 서빙하는 프로세스를 갖췄는지 관심이 없다.
그걸 몰라도 원하는 음식을 제공해달라는 요청을 하면
알아서 제공해줄 것이라고 신뢰하기 때문이다.

마찬가지로 클라이언트는 어떤 구현 객체가 주입될 지 신경쓸 필요가 없다. 오직 자신의 역할인 인터페이스가 어떤 것에 의존하는지에만 집중할 수 있다.(다형성)

또한 복잡해보이는 구현 클래스들이 하나의 추상 클래스의 상속을 통해 같은 개념아래 묶여있는 것을 확인할 수도 있다. 즉 구현 클래스 간의 관계 파악에도 용이하다.
