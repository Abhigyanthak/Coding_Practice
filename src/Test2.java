import java.util.HashMap;
import java.util.Map;

public class Test2 {
    public static void main(String args []){
        String s = "abcabcbb";
        System.out.println(Test2.longestString(s));
    }

    public static String longestString(String s){
        Map<Character, Integer> map = new HashMap<>();
        int start =0;
        int maxlength =0;
        int startIndex=0;
        for(int end =0; end < s.length(); end++){
            char ch = s.charAt(end);

            if(map.containsKey(ch)){
                start = Math.max(start, map.get(ch) +1);
            }
            map.put(ch,end);

            if(end - start +1 > maxlength){
                maxlength = end- start +1;
                startIndex = start;
            }
        }
        return s.substring(startIndex, startIndex+maxlength);
    }
}
