import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class RemoveDuplicatesFromTheString {
    public static void main (String args []){
        String s = "dabcadefg";
        /*Map<Character, Long> collect = s.chars().mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(
                        Function.identity(),
                        LinkedHashMap::new,
                        Collectors.counting()
                ));
        List<Character> withoutDuplicates = collect.entrySet()
                .stream()
                .filter(e->e.getValue() ==1)
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());
        System.out.println(withoutDuplicates);*/

        Arrays.stream(s.split("")).distinct().forEach(System.out::print);
    }
}
