import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupTheWordsByLength {

    public static void main(String args []) {
        List<String>  words = Arrays.asList("cat","mat","bat","apple","banana");

        Map<Integer, List<String>> groupedWords = words.stream().collect(Collectors.groupingBy(
                String::length
        ));
        System.out.println(groupedWords);
    }
}
