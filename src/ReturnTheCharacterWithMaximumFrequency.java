import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class ReturnTheCharacterWithMaximumFrequency {
    public static void main(String args []){
        String s = "javadeveloper";
        Character c1 = s.chars().mapToObj(c-> (char) c)
                .collect(Collectors.groupingBy(
                        Function.identity(),
                        LinkedHashMap::new,
                        Collectors.counting()
                ))
                .entrySet()
                .stream()
                .max(Comparator.comparing(Map.Entry::getValue))
                .get().getKey();
        System.out.println(c1);
    }
}
