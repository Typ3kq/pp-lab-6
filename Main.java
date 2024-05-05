import company.models.Manager;
import company.models.Worker;

public class Main {
    public static void main(String[] args) {
        Worker worker1 = new Worker("Roberto", 3000, 1);
        Worker worker2 = new Worker("Lily", 1500, 2);
        Worker worker3 = new Worker("Jamie", 1800, 3);
        Worker worker4 = new Worker("Mike", 2100, 4);

        Manager manager = new Manager("George", 7000, 5);

        System.out.println("Salary of worker1: " + worker1.getSalary());
        worker1.work();

        System.out.println("Salary of worker2: " + worker2.getSalary());
        worker2.work();

        System.out.println("Salary of worker3: " + worker3.getSalary());
        worker3.work();

        System.out.println("Salary of worker4: " + worker4.getSalary());
        worker4.work();

        System.out.println("Salary of manager: " + manager.getSalary());
        manager.work();
    }
}