import java.awt.*;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class SortTheEmployeeBySalary {
    public static void main(String args []){
        List<Employee> employees = Arrays.asList(
                new Employee(101,"Abhigyan",1000000),
                new Employee(102,"Ravi", 20222222),
                new Employee(103,"Jhon", 3000)
        );

        List<Employee> sortedEmployee = employees.stream().sorted(Comparator.comparing(Employee::getSalary)).collect(Collectors.toList());
        System.out.println(sortedEmployee);

    }
}
