import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class OccurenceOfEachWordInString {
    public static void main(String args []) {
        String s = "I love java Programming";
        Map<String, Long> frequency = Arrays.stream(s.split(" ")).collect(
                Collectors.groupingBy(
                        Function.identity(),
                        LinkedHashMap::new,
                        Collectors.counting()
                )
        );
        System.out.println(frequency);
    }
}
