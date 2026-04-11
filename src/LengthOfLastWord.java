public class LengthOfLastWord {
    public static void main(String args []){
        String s = "Hello World";
        System.out.println(LengthOfLastWord.lengthOfLastWord(s));
    }
    public static int lengthOfLastWord(String s) {
        String str [] = s.split(" ");
        String s1 [] = new String[s.length()];
        for(int i=0;i<str.length;i++){
            s1[i]=str[str.length-1];
            break;
        }
        return s1.length;
    }
}
