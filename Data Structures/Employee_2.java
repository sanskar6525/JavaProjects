package CollectionFramework;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;

public class Employee_2 implements Comparable<Employee_2> {
    private String name;
    private int number;
    private Date hireDate;

    public Employee_2(String name, int number, Date hireDate) {
        this.name = name;
        this.number = number;
        this.hireDate = hireDate;
    }

    public String getName() {
        return name;
    }

    public int getNumber() {
        return number;
    }

    public Date getHireDate() {
        return hireDate;
    }

    @Override
    public int compareTo(Employee_2 other) {
        return this.hireDate.compareTo(other.getHireDate());
    }

    @Override
    public String toString() {
        return "Employee{name='" + name + "', number=" + number + ", hireDate=" + hireDate + "}";
    }

    public static void main(String[] args) {
        List<Employee_2> employees = new ArrayList<>();
        employees.add(new Employee_2("John", 1001, new Date(2020, 0, 1)));
        employees.add(new Employee_2("Alice", 1002, new Date(2019, 5, 15)));
        employees.add(new Employee_2("Bob", 1003, new Date(2021, 2, 10)));

        Collections.sort(employees);

        System.out.println("Employees in order of seniority:");
        for (Employee_2 employee : employees) {
            System.out.println(employee);
        }
    }
}