public class Search_Element_InArray {
    public static String solve(int N, int X, int[] A) {

        for(int i =0; i < N; i++) {
            if (A[i] == X) {

                return "YES";

            }
        }
        return "NO";

    }

    public static void main(String args []){
        int arr[] = {1, 2, 3, 4, 5};
        int n = arr.length;
        int x = 3;
        System.out.println(solve(n, x, arr));
    }

}
