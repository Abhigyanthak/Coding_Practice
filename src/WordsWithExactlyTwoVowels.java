import java.util.Arrays;

public class WordsWithExactlyTwoVowels {
    public static void main(String args []) {
        String s = "I am Learning Streams API in Java";
        Arrays.stream(s.split(" ")).filter(x->x.replaceAll("[^aeiouAEIOU]","").length()==2)
                .forEach(System.out::println);
    }
}
