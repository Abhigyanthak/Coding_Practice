import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class SortMapValue {
    public static void main(String args []){
        Map<String, Integer> map = new HashMap<>();
        map.put("A", 20);
        map.put("B", 50);
        map.put("A", 20);
        map.put("B", 70);
        map.put("B", 0);
        map.put("C", 40);
        map.put("D", 20);
        map.put("D", 10);

        Map<String,Integer> sortedMap = map.entrySet().stream().sorted(Map.Entry.comparingByValue())
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        Map.Entry::getValue,
                        (e1,e2)->e1,
                        LinkedHashMap::new
                ));
        System.out.println(sortedMap);
    }
}
