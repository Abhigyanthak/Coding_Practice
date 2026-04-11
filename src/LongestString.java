import java.util.Comparator;
import java.util.Optional;
import java.util.stream.Stream;

public class LongestString {
    public static void main(String args []){
        String s= "Java Developer";
        Optional<String> max = Stream.of(s.split(" ")).max(Comparator.comparingInt(String::length));
        System.out.println(max);
    }
}
