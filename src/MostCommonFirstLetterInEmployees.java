import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class MostCommonFirstLetterInEmployees {
    public static void main(String args []){
        List<Employees> employees = List.of(
               new Employees(1,"Jhon",23,10000,"Male","IT","hyd",2020),
                new Employees(1,"Smith",23,10000,"Male","IT","hyd",2020),
                new Employees(1,"Jack",23,10000,"Male","IT","hyd",2020)
        );

        Character chars = employees.stream()
                .map(e->e.getName().charAt(0))
                .collect(Collectors.groupingBy(
                        Function.identity(),
                        Collectors.counting()
                )).entrySet().stream()
                .max(Map.Entry.comparingByValue())
                .map(Map.Entry::getKey)
                .get();

        System.out.println(chars);
    }
}
