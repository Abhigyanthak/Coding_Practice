import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class SeperateListByEvenAndOdd {
    public static void main(String args []) {
        int [] arr = {1,2,3,4,5,6,7,8};
        List<Integer> list = Arrays.stream(arr).boxed().collect(Collectors.toList());

        Map<Boolean,List<Integer>> seperatedList = list.stream().collect(Collectors.groupingBy(x->x%2==0,Collectors.toList()));
        System.out.println(seperatedList);
    }
}
