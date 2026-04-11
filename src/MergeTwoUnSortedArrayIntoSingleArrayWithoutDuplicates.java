import java.awt.*;
import java.util.Arrays;
import java.util.stream.IntStream;

public class MergeTwoUnSortedArrayIntoSingleArrayWithoutDuplicates {
    public static void main(String args []){
        int a [] = new int [] {34,7,90,1};
        int b [] = new int [] {40,90,1,2};
        int c [] = IntStream.concat(Arrays.stream(a),Arrays.stream(b)).distinct().sorted().toArray();
        System.out.println(Arrays.toString(c));
    }
}
