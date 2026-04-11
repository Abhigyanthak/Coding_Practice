import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PrintMapKeysWhereValuesAreSame {
    public static void main(String[] args) {
        Map<String,String> map = new HashMap<>();
        map.put("location1", "pune");
        map.put("location2", "Delhi");
        map.put("location3", "pune");

        Map<String, List<String>> reversemMap = new HashMap<>();

        for(Map.Entry<String,String> entry : map.entrySet()){
            reversemMap.computeIfAbsent(entry.getValue(),k -> new ArrayList<>()).add(entry.getKey());
        }

        for(Map.Entry<String,List<String>> entry : reversemMap.entrySet()){
            if(entry.getValue().size() >1){
                System.out.println("Value: " + entry.getKey() + " -> keys: " + entry.getValue());
            }
        }
    }
}
