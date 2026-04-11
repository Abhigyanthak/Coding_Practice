import java.util.Arrays;
import java.util.Comparator;

public class WordWithLargestLength {
    public static void main(String args []){
        String s = "My name is Abhigyan";
        String longestlength = Arrays.stream(s.split(" ")).max(Comparator.comparing(String::length)).toString();
        System.out.print(longestlength);
    }
}
