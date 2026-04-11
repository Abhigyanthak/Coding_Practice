public class PrintArrayAfterRemovingDuplicates {
    public static void main(String args []) {
        int arr [] = {7,7,2,2,8,0};
        int k=0;
        for(int i=0; i<arr.length; i++) {
            boolean flag = false;
            for (int j = 0; j < i; j++) {
                if (arr[i] == arr[j]) {
                    flag = true;
                    break;
                }
            }
            if(!flag){
                arr[k++] = arr[i];
            }
        }
        for(int i=0; i<k;i++){
            System.out.println(arr[i]);
        }
    }
}
