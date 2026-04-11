public class PalindromeString {
    public static void main(String args []){
        String s = "madam";
        String rev ="";
        char ch;
        for(int i=s.length()-1;i>=0;i--){
            ch=s.charAt(i);
            rev=rev+ch;
        }
        System.out.println(rev);
        if(s.equals(rev)){
            System.out.println("It is palindrome");
        } else{
            System.out.println("Not palindrome");
        }
    }
}
