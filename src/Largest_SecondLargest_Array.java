public class Largest_SecondLargest_Array {
    public static void solve(int N, int[] A) {
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        int sum =0;
        for(int i = 0; i < N; i++) {
            if(A[i] > largest) {
                secondLargest = largest;
                largest = A[i];
            } else if(A[i] > secondLargest && A[i] != largest) {
                secondLargest = A[i];
            }
        }
        sum = largest + secondLargest;
        System.out.println("Sum of Largest and Second Largest: " + sum);
        System.out.println("Largest: " + largest);
        System.out.println("Second Largest: " + secondLargest);
    }

    public static void main(String args []){
        int arr[] = {1, 2, 3, 4, 5};
        int n = arr.length;
        solve(n, arr);
    }
}
