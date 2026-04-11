public class ReverseStringSpecialCase {
    public static void main(String args []){
        //reverse only character
        String s = "ab$cd";
        int left =0;
        int right = s.length()-1;
        char ch [] = s.toCharArray();
        while(left < right){
            if(!Character.isAlphabetic(ch[left])){
                left++;
            }
            else if(!Character.isAlphabetic(ch[right])){
                right --;
            }
            else{
                char temp = ch[left];
                ch[left]= ch[right];
                ch[right]= temp;
                left++;
                right--;
            }
        }
        System.out.println(ch);
    }
}
