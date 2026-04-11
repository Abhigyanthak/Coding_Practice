import java.util.Arrays;

public class AnagramChecker {
    public static void main(String args []){
        String s1= "Ant";
        String s2= "aan";
        if(s1.length()!= s2.length()){
            System.out.println("Not Anagram");
        } else {
            char arr1[] = s1.toLowerCase().toCharArray();
            char arr2[] = s2.toLowerCase().toCharArray();
            Arrays.sort(arr1);
            Arrays.sort(arr2);
            if(Arrays.equals(arr1, arr2)){
                System.out.println("It an Anagram");
            } else {
                System.out.println("Not an Anagram");
            }
        }
    }
}
