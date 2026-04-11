import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;

public class AverageOfAge {
    public static void main(String args[]){
        List<Person> personList = Arrays.asList(
                new Person("Abhigyan", 29),
                new Person("Ravi", 25)
        );

        OptionalDouble result = personList.stream().mapToInt(Person::getAge).average();
        System.out.println(result);

    }
}
