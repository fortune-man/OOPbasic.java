package OOPBasic;



public class Job {
    String work;

    public void Job(String work) {
        this.work = work;
        System.out.println("My job is " + work);
    }

}

class Engineer extends Job{ }

class Manager extends Job{
    public static void main(String[] args) {
        Engineer engineer = new Engineer();
        Manager manager = new Manager();

        engineer.Job("engineer");
        manager.Job("manager");
    }
}
