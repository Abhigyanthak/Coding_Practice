import java.util.Arrays;

public class SecondLargestNumberInArray {
    public static void main (String args []){
       int arr [] = {1,78,90,3,4,5};
       System.out.println(getSecondLargestNumber(arr));
    }

    static int getSecondLargestNumber (int [] arr){
        int n = arr.length;
        int largest = -1, secondLargest = -1;
        for(int i = 0 ; i < n ; i++){
            if(arr[i] > largest){
                largest = arr[i];
            }
        }
        for(int i=0 ; i<n; i++){
            if(arr[i] > secondLargest && arr[i] != largest){
                secondLargest = arr[i];
            }
        }
        return secondLargest;
    }
}
