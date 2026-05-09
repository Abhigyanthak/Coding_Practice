import java.util.Arrays;

public class ValidAnagram {
    public static void main(String[] args) {
        String str1 = "abc";
        String str2 = "ca";
        if(str1.length() != str2.length()) {
            System.out.println("Not Anagram");
            return ;
        }
        char[] arr1 = str1.toCharArray();
        char[] arr2 = str2.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        System.out.println(Arrays.equals(arr1, arr2));
    }
}
