import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import company.models.Manager;
import company.models.Worker;
import company.abstracts.Employee;

public class Main {
    public static void main(String[] args) {
        Worker worker1 = new Worker("Roberto", 3000, 1, "2023-09-01", "Praktykant");
        Worker worker2 = new Worker("Lily", 1500, 2, "2022-04-10", "Specjalista");
        Worker worker3 = new Worker("Jamie", 1800, 3, "2021-11-11", "Kierownik");
        Worker worker4 = new Worker("Mike", 2100, 4, "2020-05-05", "Dyrektor");
        Worker worker5 = new Worker("Vincent", 4500, 3, "2020-03-17", "Menadżer");
        Worker worker6 = new Worker("Jamal", 5500, 4, "2020-03-10", "Menadżer");
                                                                                     
        Manager manager1 = new Manager("Michael", 7000, 5, "2018-02-20", "Prezes");
        Manager manager2 = new Manager("Travis", 8000, 2, "2018-01-15", "Prezes");
        Manager manager3 = new Manager("Enrique", 9000, 1, "2017-04-20", "Szef"); 
                                                                              

        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(worker1);
        employees.add(worker2);
        employees.add(worker3);
        employees.add(worker4);
        employees.add(worker5);
        employees.add(worker6);
        employees.add(manager1);
        employees.add(manager2);
        employees.add(manager3);

        double totalSalary = 0;
        double totalManagerSalary = 0;
        double totalWorkerSalary = 0;

        
        Map<Integer, List<Employee>> idMap = new HashMap<>();
        for (Employee emp : employees) {
            totalSalary += emp.getSalary();
            if (emp instanceof Manager) {
                totalManagerSalary += emp.getSalary();
            } else if (emp instanceof Worker) {
                totalWorkerSalary += emp.getSalary();
            }
            if (idMap.containsKey(emp.getId())) {
                idMap.get(emp.getId()).add(emp);
            } else {
                List<Employee> empList = new ArrayList<>();
                empList.add(emp);
                idMap.put(emp.getId(), empList);
            }
        }

        System.out.println("Total salary: " + totalSalary);
        System.out.println("Total manager salary: " + totalManagerSalary);
        System.out.println("Total worker salary: " + totalWorkerSalary);

        for (Map.Entry<Integer, List<Employee>> entry : idMap.entrySet()) {
            List<Employee> empList = entry.getValue();
            if (empList.size() > 1) {
                System.out.println("Employees with same ID: ");
                for (Employee emp : empList) {
                    System.out.println("- " + emp.getName());
                }
            }
        }
    }
}