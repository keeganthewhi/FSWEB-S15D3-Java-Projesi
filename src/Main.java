import com.workintech.company.Employee;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Employee> employees = new LinkedList<>();

        employees.add(new Employee(1,"aytekin", "ozis"));
        employees.add(new Employee(1,"shane", "larkin"));
        employees.add(new Employee(2,"rodrigue", "boubouis"));
        employees.add(new Employee(3,"tibor", "pleiss"));
        employees.add(new Employee(4,"vasilie", "micic"));
        employees.add(new Employee(4,"will", "clyburn"));

        Map<Integer,Employee> employeeMap = new HashMap<>();
        List<Employee> duplicateList = new ArrayList<>();

        Iterator<Employee> employeeIterator = employees.iterator();

        while (employeeIterator.hasNext()){
            Employee employee = employeeIterator.next();
            if(employeeMap.containsKey(employee.getId())){
                duplicateList.add(employee);
                employeeIterator.remove();
            } else {
                employeeMap.put(employee.getId(),employee);
            }
        }
        System.out.println("mevcut:");
        System.out.println(employees);
        System.out.println("tekiller: ");
        System.out.println(employeeMap);
        System.out.println("silinenler: ");
        System.out.println(duplicateList);


    }
}