import java.util.HashMap;
import java.util.Map;

public class Solution2 {
    public static int [] twoSum(int [] arr, int target){

        Map<Integer, Integer> map = new HashMap<>();

        for(int i =0 ; i<arr.length; i++){
            int complement = target - arr[i];

            if(map.containsKey(complement)) {
                return new int[]{map.get(complement), i};
            }
            map.put(arr[i], i);
        }
        return new int [] {};
    }
    public static void main(String args []){
        int [] arr = {0,1,2,3,4,5,6,8};
        int target = 9;

        int[] result = twoSum(arr, target);
        System.out.println(result[0] + ", " + result[1]);
    }
}
