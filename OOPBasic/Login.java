package OOPBasic;

class User{
    String name; //멤버 변수
    private static int num;

    public int count(int num){
        this.num = num;
        return num;
    }

    String setName(String name) {
        this.name = name;
        return name;
    }

    public static void main(String[] args) {
        System.out.println("num = " + num);
        User user = new User();
        User user2 = new User();
        System.out.println("user = " + user.count(100));
        System.out.println("user2 = " + user2.count(200));
    }
}
public class Login {
    public static void main(String[] args) {
        User user1 = new User();
        User user2 = new User();

        User user0 = new User();

        System.out.println("user = " + user0.count(100));
        System.out.println("user2 = " + user2.count(200));

        System.out.println("user1 = " + user1.setName("Steve")); // 인스턴스 변수
        System.out.println("user2 = " + user2.setName("Jobs")); // 인스턴스 변수


    }
}
