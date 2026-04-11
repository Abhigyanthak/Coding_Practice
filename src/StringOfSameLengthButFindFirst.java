import java.util.Arrays;
import java.util.Comparator;

public class StringOfSameLengthButFindFirst {
    public static void main(String args []){
        String s = "I java love Java painting painting";
        String s1 = Arrays.stream(s.split(" "))
                .max(Comparator.comparing(String::length))
                .stream().findFirst()
                .orElseThrow(null);
        System.out.println(s1);
    }
}
