import java.util.Arrays;

public class LongestCommonSubString {
    public static void main(String args []) {
        String str[] = {"flower", "flow", "flight"};
        Arrays.sort(str);
        String first = str[0];
        String last = str[str.length-1];
        int i=0;
        while(first.charAt(i) == last.charAt(i)){
            i++;
        }
        String prefix = first.substring(0,i);
        System.out.println(prefix);
    }
}
