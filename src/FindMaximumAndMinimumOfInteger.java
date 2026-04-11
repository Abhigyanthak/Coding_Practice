import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class FindMaximumAndMinimumOfInteger {
    public static void main(String args []){
        List<Integer> numberList = Arrays.asList(34,56,9,43);
        int max = numberList.stream().max(Comparator.naturalOrder()).get();
        int min = numberList.stream().min(Comparator.naturalOrder()).get();
        System.out.println(max);
        System.out.println(min);
    }
}
