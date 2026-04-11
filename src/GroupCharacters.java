import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class GroupCharacters {
    public static void main(String args[]) {
        List<Character> chars = Arrays.asList(
                'A', 'b', '3', 'Z', 'x', '#', '7', '@'
        );
        chars.stream().collect(
                Collectors.groupingBy(
                        ch -> getCharCategory(ch.charValue())
                )
        );
    }

    private static Object getCharCategory(char c) {
        // if(Character.isUpperCase(c)) return charCategory.UPPERCASE;

        return null;
    }
}
