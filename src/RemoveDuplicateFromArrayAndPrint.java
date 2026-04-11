import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class RemoveDuplicateFromArrayAndPrint {
    public static void main(String args []){
        List<Integer> numbers = Arrays.asList(1,2,2,2,3,4,5);
        Set<Integer> set =new HashSet<>();
        List<Integer> removedDuplicates = numbers.stream().filter(n -> set.add(n)).collect(Collectors.toList());
        System.out.println(removedDuplicates);
    }
}
