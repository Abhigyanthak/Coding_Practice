import java.util.*;

public class AnagramsInString {
    public static void main(String args []){
        String s [] = {"ate","eat","bit","tib"};
        Map<String, List<String>> map = new HashMap<>();
        for(String word : s){
            char ch [] = word.toCharArray();
            Arrays.sort(ch);

            String key = new String(ch);
            map.computeIfAbsent(key, k -> new ArrayList<>())
                    .add(word);
        }
        for(List<String> groups : map.values()){
            if(groups.size()>1){
                System.out.println(groups);
            }
        }
    }
}
