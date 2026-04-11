public class PrintArrayByRemovingDuplicates {
    public static void main(String args []) {
        int arr [] = {1,2,3,4,4,6,7,7,8,8};
        int t [] = new int [arr.length];
        int j=0;
        for(int i=0; i<arr.length-1; i++){
            if(arr[i] == arr[i+1]){
                 t[j++] = arr[i];
            }
        }
        //t[j++]=arr[arr.length-1];
        for(int i=0; i<j; i++){
            arr[i] = t[i];
            System.out.println(arr[i]);
        }
    }
}
