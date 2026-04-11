import java.util.*;

public class PrintDuplicateNumbersFromArray {
    public static void main(String args[]) {
        int arr1[] = {1,2,3,4,5,6,7,6,8,7,9,5,10};

       Map<Integer, Integer> map = new HashMap<>();
       for (int i : arr1) {
            map.put(i, map.getOrDefault(i, 0) + 1);
       }
       for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
           if (entry.getValue() > 1) {
               System.out.println("Duplicate number " + entry.getKey());
           }
       }
    }
}
