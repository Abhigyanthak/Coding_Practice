public class TwoSumProblem {
    public static void main(String args []) {
        int arr [] = {3,2,4};
        int target = 6;
        boolean flag = false;
        int left = 0;
        int right = arr.length-1;
        while(left < right){
            if(arr[left] + arr[right] == target){
                System.out.println(arr[left]+" "+arr[right]);
                right --;
                left ++;
                flag = true;
            }
            else if (arr[left] + arr[right] < target){
                left++;
            }
            else {
                right --;
            }
        }
     if(!flag){
         System.out.println("Pair not Found");
     }
    }
}
