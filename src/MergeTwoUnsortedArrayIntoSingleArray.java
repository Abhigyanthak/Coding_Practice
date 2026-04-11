import java.util.Arrays;
import java.util.stream.IntStream;

public class MergeTwoUnsortedArrayIntoSingleArray {
    public static void main(String args []){
        int a [] = new int [] {2,9,1,4};
        int b [] = new int [] {55,98,0};
        int c [] = IntStream.concat(Arrays.stream(a),Arrays.stream(b)).sorted().toArray();
        System.out.println(Arrays.toString(c));
    }
}
