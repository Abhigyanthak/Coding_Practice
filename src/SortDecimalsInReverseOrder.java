import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SortDecimalsInReverseOrder {
    public static void main(String args []){
        List<Double> decimalList = Arrays.asList(12.5,9.0,29.34,2.0);
        List<Double> sortedDecimal = decimalList.stream().sorted().toList().reversed();
       // System.out.println(sortedDecimal);

        decimalList.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
    }
}
