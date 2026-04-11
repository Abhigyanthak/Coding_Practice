public class LongestNonRepeatedSubstringCount {
    public static void main(String args []){
        String s = "abcabcbb";
        int arr [] = new int[256];
        int left = 0, right = 0;
        int max = 0;
        while(right < s.length()){

            char currentChar = s.charAt(right);
            int currentCharAscii = (int) currentChar;

            arr[currentCharAscii] = arr[currentCharAscii] + 1;

            while(arr[currentCharAscii] > 1){

                char leftChar = s.charAt(left);
                int leftCharAscii = (int) leftChar;
                arr[leftCharAscii] = arr[leftCharAscii] - 1;

                left++;

            }

            int currentWindow = right - left +1;
            if(currentWindow > max){
                max= currentWindow;
            }
            right ++;
        }
        System.out.println(max);
    }
}