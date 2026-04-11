import java.util.Arrays;

public class MoveOneToTheRight {
    public static void main(String args []){
        int arr[] = {2,0,1,1,3,45,1};
        int counter = 0;
        for(int i=0; i<arr.length; i++){
            if(arr[i]!=1){
                arr[counter] = arr[i];
                counter++;
            }
        }
        while(counter < arr.length){
            arr[counter] = 1;
            counter++;
        }
        System.out.println(Arrays.toString(arr));
    }
}
