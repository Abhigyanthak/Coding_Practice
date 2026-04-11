public class LargestAndSecondLargest {
    public static void main(String args []){
        int arr [] = {13, 30, 2, 15, 33};
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++){
            if(arr[i] > largest){
                secondLargest = largest;
                largest = arr[i];
            } else if(arr[i] > secondLargest && arr[i]!= largest){
                secondLargest = arr[i];
            }
        }
        System.out.println("Largest element =" +largest);
        System.out.println("Second largest element =" +secondLargest);
    }
}
