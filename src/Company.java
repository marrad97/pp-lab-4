import employees.*;

public class Company {
    public static void main(String[] args) {
        Employee[] employees = new Employee[5];

        employees[0] = new Manager("Jan Kowalski", 3000.0, 0);
        employees[1] = new Worker("Anna Kowalska", 3500.0, "HR");
        employees[2] = new Employee("Zbigniew Kowalska", 4000.0);
        employees[3] = new Employee("Katarzyna Kowalska", 4500.0);
        employees[4] = new Worker("Piotr Kowalski", 5000.0, "HR");

        System.out.println("Pracownik o indeksie 3: " + employees[3]);

        employees[3].setSalary(5500.0);

        System.out.println("Wszyscy pracownicy:");
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }

}
