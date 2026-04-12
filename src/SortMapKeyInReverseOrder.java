import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class SortMapKeyInReverseOrder {
    public static void main(String args []){
        Map<Integer,String> map = new HashMap<>();
        map.put(1,"One");
        map.put(0,"Zero");
        map.put(2,"Two");

        List<Map.Entry<Integer, String>> collect = map.entrySet().stream().sorted(Comparator.comparingInt(Map.Entry<Integer, String>::getKey).reversed()).collect(Collectors.toList());
        System.out.println(collect);

    }
}
