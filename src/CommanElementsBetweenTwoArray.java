import java.util.Arrays;
import java.util.List;

public class CommanElementsBetweenTwoArray {
    public static void main(String args []){
        List<Integer> list1 = Arrays.asList(12,3,4,5,6);
        List<Integer> list2 = Arrays.asList(2,3,4,5,67);
        list1.stream().filter(list2::contains).forEach(System.out::println);
    }
}
