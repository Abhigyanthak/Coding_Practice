import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapQuestion {

    public static void main(String args []){
        Map<Integer, Integer> map = new HashMap<>();
        map.put(1,2);
        map.put(2,3);
        map.put(3,3);
        //map.put(3,map)

        List<Integer> list = new ArrayList<>();
        for(Map.Entry<Integer, Integer> mp : map.entrySet()){


            int key = mp.getKey();
            int value = mp.getValue();

            for(int i =0; i < value; i++){
                list.add(key);
            }
        }
        System.out.println(list);
    }
}
