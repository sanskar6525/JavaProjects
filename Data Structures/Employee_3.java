package CollectionFramework;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class Employee_3 {
	private String name;
    private int number;
    private String hireDate;

    public Employee_3(String name, int number, LocalDate localDate) {
        this.name = name;
        this.number = number;
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd MMMM yyyy");
        String formattedDate = localDate.format(formatter);
        this.hireDate = formattedDate;
    }
    
    public static void display(List<Employee_3> L)
    {
    	for(Employee_3 T:L)
    		System.out.println(T.name+"--"+T.number+"--"+T.hireDate);
    	System.out.println("\n");
    }
    
    static final Comparator<Employee_3> SENIORITY_ORDER = 
            new Comparator<Employee_3>() {public int compare(Employee_3 e1, Employee_3 e2) {
            	return e2.hireDate.compareTo(e1.hireDate);}};
           	
    public static void main(String[] args) 
    {
        List<Employee_3> employees = new ArrayList<>();
        employees.add(new Employee_3("Alice", 1001, LocalDate.of(2019, 5, 15)));
        employees.add(new Employee_3("John", 1000, LocalDate.of(2020, 6, 1)));
        employees.add(new Employee_3("Bob", 1002, LocalDate.of(2023, 5, 31)));

        System.out.println("Before sorting: ");
        display(employees);
        Collections.sort(employees, SENIORITY_ORDER);
        System.out.println("After sorting: ");
        display(employees);
    }
}
