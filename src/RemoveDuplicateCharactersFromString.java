import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class RemoveDuplicateCharactersFromString {
    public static void main(String args []) {
        String s = "programming";
        s.chars().mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(
                        Function.identity(),
                        LinkedHashMap::new,
                        Collectors.counting()
                )).entrySet().stream()
                .distinct()
                .map(Map.Entry::getKey)
                .forEach(e -> System.out.print(e));
    }
}
