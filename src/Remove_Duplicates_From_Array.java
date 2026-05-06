import java.util.HashSet;
import java.util.Set;

public class Remove_Duplicates_From_Array {
    public static void main(String [] args){
        int [] arr = {1,3,3,4,5,6,4,3};
        Set<Integer> set = new HashSet<Integer>();

        // Add all elements to HashSet (duplicates are automatically removed)
        for(Integer i : arr){
            set.add(i);
        }

        // Print unique elements
        System.out.println("Unique elements: " + set);

        // Or print one by one
        System.out.println("\nUnique elements (one per line):");
        for(Integer element : set){
            System.out.println(element);
        }
    }
}
