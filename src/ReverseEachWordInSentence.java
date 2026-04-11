import java.util.Arrays;
import java.util.stream.Collectors;

public class ReverseEachWordInSentence {
    public static void main(String args []){
        String s = "Java is best";
        String collect = Arrays.stream(s.split(" "))
                .map(word -> new StringBuilder(word).reverse().toString())
                .collect(Collectors.joining(" "));

        //without using StringBuilder
        String s1 = Arrays.stream(s.split(" "))
                        .map(word -> Arrays.stream(word.split(""))
                                .reduce("", (rev,ch) -> ch + rev)
                        ).collect(Collectors.joining(" "));
        System.out.println(s1);
        System.out.println(collect);
    }
}
