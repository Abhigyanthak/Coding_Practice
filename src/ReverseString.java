import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ReverseString {
    public static void main(String args []) {
       String s = "GeeksforGeeks";
        /*char ch [] = s.toCharArray();
        String rev = "";
        for(int i = ch.length-1; i>=0; i--){
            rev = rev+ch[i];
        }
        System.out.println(rev.toString());*/
        String rev1 = IntStream.range(0,s.length())
                .map(i -> s.charAt(s.length()-1-i))
                .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
                .toString();
        System.out.println(rev1);
    }
}
