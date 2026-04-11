import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ReverseWordsInString {
    public static void main(String args []){
        String s = "I Love Programming";
        String rev = Arrays.stream(s.split(" ")).map(word -> new StringBuilder(word).reverse()).collect(Collectors.joining(" "));
        String rev1 = Stream.of(s).map(word -> new StringBuilder(word).reverse()).collect(Collectors.joining(" "));
        System.out.println(rev);
        System.out.println(rev1);

    }
}
