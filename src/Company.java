import employees.*;

public class Company {
    public static void main(String[] args) {
        Employee[] employees = new Employee[7];

        employees[0] = new Manager("Jan Kowalski", 3000.0, 0);
        employees[1] = new Worker("Anna Kowalska", 3500.0, "HR");
        employees[2] = new Employee("Zbigniew Kowalska", 4000.0);
        employees[3] = new Employee("Katarzyna Kowalska", 4500.0);
        employees[4] = new Worker("Piotr Kowalski", 5000.0, "HR");
        employees[5] = new Manager("Robert Kowalski", 3200.0, 0);
        employees[6] = new Worker("Magdalena Kowalska", 3300.0, "HR");


        for (Employee employee : employees) {
            employee.setSalary(employee.getSalary() + 500);
        }

        int nonManagerCount = 0;
        for (Employee employee : employees) {
            if (!(employee instanceof Manager)) {
                nonManagerCount++;
            }
        }

        for (Employee employee : employees) {
            if (employee instanceof Manager) {
                Manager manager = (Manager) employee;
                manager.setNumberOfSubordinates(nonManagerCount);
                manager.setSalary(7500.0);
            }
        }


        System.out.println("Wszyscy pracownicy:");
        for (Employee employee : employees) {
            System.out.println(employee.toString());
        }
    }

}