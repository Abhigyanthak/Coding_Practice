import java.util.Arrays;

public class Solution {

    public static void segregate(char [] arr, char firstChar){

        if( arr == null || arr.length <=1){
            return;
        }
        int left = 0;
        int right = arr.length-1;

        while(left < right){
            while(left < right && arr[left] == firstChar){
                left++;
            }
            while(left < right && arr[right] != firstChar){
                right--;
            }
            if(left < right){
                char temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
            }
        }
    }
    public static void main(String args []){
        char [] arr = {'A','B','B','A','B','A','A'};
        segregate(arr, 'A');
        System.out.println(Arrays.toString(arr));
    }
}
