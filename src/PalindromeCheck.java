public class PalindromeCheck {
    public static void main(String args[]){
        String s = "hannah";
        System.out.println(PalindromeCheck.palindromeCheck(s));
    }

    public static boolean palindromeCheck(String s) {
        //your code goes here
        boolean flag=false;
        String rev = "";
        for(int i=s.length()-1;i>=0;i--){
            rev=rev+s.charAt(i);
        }
        if(rev.equals(s)){
            flag=true;
            //break;
        }
        return flag;
    }
}
