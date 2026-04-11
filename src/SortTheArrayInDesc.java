import java.util.Arrays;
import java.util.Comparator;

public class SortTheArrayInDesc {
    public static void main(String args []) {
        int [] arr = {1,2,3,4,5};

        Arrays.stream(arr).boxed().sorted(Comparator.reverseOrder()).forEach(System.out::println);

    }
}
