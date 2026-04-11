import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CountFrequencyOfCharacter {
    public static void main(String args []){
        String s = "JAva";
        Map<Character,Long> frequency = s.chars().map(Character::toLowerCase).mapToObj(c -> (char) c )
                .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        System.out.println(frequency);
    }
}
