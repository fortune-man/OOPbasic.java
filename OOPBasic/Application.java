package OOPBasic;

public class Application {
    public static void main(String[] args) {
        Person Man = new Person();

    }
}

class Person{
    private int age;
    private int name;
    private String hobby;
    private int hobby_id;
    private String school;
    private int school_id;
    private String phoneNumber;
    private int gender;
    private int password;

    public int getAge() {
        return age;
    }

    public int getName() {
        return name;
    }

    public void setAge(int age){
        if(age >=0){
            this.age = age;
        }
        else
            this.age = 0;
    }
}
