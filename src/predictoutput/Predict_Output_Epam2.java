package predictoutput;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
/*This snippet will give IllegalStateException as we are trying to merge the duplicate Key a,
here we need to define merge function */
public class Predict_Output_Epam2 {
    public static void main(String args []){
        List<String> list = Arrays.asList("a", "b", "a");
        Map<Character, String> map = list.stream()
                .collect(Collectors.toMap(s -> s.charAt(0), s->s));
        map.entrySet().stream().forEach(System.out::println);
    }
}
