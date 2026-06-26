import java.util.LinkedHashMap;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FirstNonDuplicateCharacter {
    public static void main(String[] args){
        String s = "swiss";
        Character result = s.chars().mapToObj(c-> (char) c)
                .collect(Collectors.groupingBy(
                        Function.identity(),
                        LinkedHashMap::new,
                        Collectors.counting()
                ))
                .entrySet()
                .stream()
                .filter(e -> e.getValue() == 1)
                .map(entry -> entry.getKey())
                .findFirst()
                .orElse(null);

        System.out.println(result);
    }
}
