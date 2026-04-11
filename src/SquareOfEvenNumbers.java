import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SquareOfEvenNumbers {
    public static void main(String args []) {
        int [] arr = {1,2,3,4,5};
        List<Integer> square = Arrays.stream(arr).boxed().filter(n->n%2 == 0).map(n->n*n).collect(Collectors.toList());
        System.out.println(square);
    }
}
