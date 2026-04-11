import java.util.Arrays;

public class Solution4 {
    public static void main(String[] args) {
        String s1 ="silent";
        String s2 ="listen";
        System.out.println(Solution4.isAnangram(s1,s2));
    }
    public static boolean isAnangram(String s1, String s2){
        if(s1.length() != s2.length()){
            return false;
        }
        char [] arr1 = s1.toCharArray();
        char [] arr2 = s2.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        return Arrays.equals(arr1, arr2);
    }
}
