import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class Solution3 {
    public static void main(String args []){
        Map<Integer,String> map = new ConcurrentHashMap<>();
        map.put(1, "A");
        map.put(2, "B");
        map.put(3, "C");

        for(Integer key : map.keySet()){
            map.put(4,"O");
        }
        System.out.println(map);
    }
}
