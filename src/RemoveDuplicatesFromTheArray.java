import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class RemoveDuplicatesFromTheArray {
    public static void main(String args []) {
        int arr [] = {3,6,4,7,8,8,9,12,3,4,4,4,4};

        /*Set<Integer> set = new HashSet<>();
        List<Integer> duplicaElementsOnly = Arrays.stream(arr).boxed()
                .filter(e -> !set.add(e))
                .collect(Collectors.toList());

        System.out.println(duplicaElementsOnly);

        //Print Array after removing duplicates
         Arrays.stream(arr).distinct().forEach(System.out::print);*/
        //System.out.println(array);

        int k=1;
        for(int i=1; i<arr.length; i++){
            if(arr[i] != arr[i-1]){
                arr[k++] = arr[i];
            }
        }
        for(int i=0; i<arr.length; i++){
            System.out.println(arr[k]);
        }
    }
}
