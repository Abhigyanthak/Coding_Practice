import java.util.Arrays;
import java.util.stream.IntStream;

public class ReverseArrayUsingJava8 {
    public static void main(String args []){
        int a [] = {1,2,3,4,5};
        int rev [] = IntStream.range(0,a.length)
                .map(i -> a[a.length-1-i])
                .toArray();
    }
}
