import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CharactersAlphabatically {
    public static void main(String args []) {
       /* String s = "aacbbcddea";
        List<Character> collect = s.chars().mapToObj(c -> (char) c).sorted().collect(Collectors.toList());
        System.out.println(collect);*/

        String [] S = {"A","A","C","C","D","B","A","D"};
        List<String> collect1 = Arrays.stream(S).sorted().collect(Collectors.toList());
        System.out.println(collect1);
    }
}
