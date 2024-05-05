import company.models.Manager;
import company.models.Worker;

public class Main {
    public static void main(String[] args) {
        Worker worker1 = new Worker("Roberto", 3000, 1, "2023-09-01", "Praktykant");
        Worker worker2 = new Worker("Lily", 1500, 2, "2022-04-10", "Specjalista");
        Worker worker3 = new Worker("Jamie", 1800, 1, "2021-11-11", "Kierownik"); 
        Manager manager = new Manager("George", 7000, 3, "2018-02-20", "Prezes");

        System.out.println(worker1.getName() + " has code: " + worker1.hashCode());
        System.out.println(worker2.getName() + " has code: " + worker2.hashCode());
        System.out.println(worker3.getName() + " has code: " + worker3.hashCode());
        System.out.println(manager.getName() + " has code: " + manager.hashCode());

        System.out.println(worker3.getName() + " equals worker1: " + worker3.equals(worker1));
        System.out.println(worker3.getName() + " equals worker2: " + worker3.equals(worker2));
        System.out.println(worker3.getName() + " equals manager: " + worker3.equals(manager));
    }
}