import java.util.ArrayList;
import company.models.Manager;
import company.models.Worker;
import company.abstracts.Employee;

public class Main {
    public static void main(String[] args) {
        Worker worker1 = new Worker("Roberto", 3000, 1, "2023-09-01", "Praktykant");
        Worker worker2 = new Worker("Lily", 1500, 2, "2022-04-10", "Specjalista");
        Worker worker3 = new Worker("Jamie", 1800, 3, "2021-11-11", "Kierownik");
        Worker worker4 = new Worker("Mike", 2100, 4, "2020-05-05", "Dyrektor");

        Manager manager = new Manager("George", 7000, 5, "2018-02-20", "Prezes");

        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(worker1);
        employees.add(worker2);
        employees.add(worker3);
        employees.add(worker4);
        employees.add(manager);

        for (Employee emp : employees) {
            System.out.println("- " + emp.getName() + " (ID: " + emp.getId() +
                    ", Position: " + emp.getPosition() +
                    ", Hire date: " + emp.getHireDate() +
                    ", Salary: " + emp.getSalary() + ")");
            emp.work();
        }
    }
}