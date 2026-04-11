import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Test {
    public static void main(String args []){
        List<String> list = Arrays.asList("latha","Abhigyan","ravi");
        String result = list.stream()
                .map(s -> String.valueOf(s.charAt(0)))
                .collect(Collectors.joining());
        System.out.println(result);
    }
}
