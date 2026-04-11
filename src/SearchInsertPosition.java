public class SearchInsertPosition {
    public static void main(String args []){
        int arr [] ={1,3,5,6};
        int target = 7;
        int index = arr.length;
        for(int i=0; i<arr.length;i++){
            if(arr[i] >= target ){
                index=i;
                break;
            }
        }
        System.out.println(index);
    }
}
