import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class AnagramOfString {
    public static void main (String args []) {
        String s1 = "listen";
        String s2 = "silent";

        Map<Integer, Long> collect = s1.chars().boxed()
                .collect(Collectors.groupingBy(
                        Function.identity(),
                        Collectors.counting()
                ));

        Map<Integer, Long> collect1 = s2.chars().boxed()
                .collect(Collectors.groupingBy(
                        Function.identity(),
                        Collectors.counting()
                ));

        System.out.println(collect.equals(collect1));
    }
}
