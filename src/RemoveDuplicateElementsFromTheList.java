import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicateElementsFromTheList {
    public static void main(String args []){
        List<String> listOfStrings = Arrays.asList("java","python","java","kotlin");
        List<String> listOfStringsWithoutDuplicates = listOfStrings.stream().distinct().collect(Collectors.toList());
        System.out.println(listOfStringsWithoutDuplicates);
    }
}
