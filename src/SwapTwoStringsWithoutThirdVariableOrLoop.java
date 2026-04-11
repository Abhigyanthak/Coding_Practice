public class SwapTwoStringsWithoutThirdVariableOrLoop {
    public static void main (String args []){
        String S1 = "Java";
        String S2 = "Software";
        S1 = S1+S2;
        S2 = S1.substring(0,S1.length()-S2.length());
        System.out.println(S1.length()-S2.length());
        S1 = S1.substring(S2.length());
        System.out.println("Strings after swap : S1=" + S1 + " and S2=" + S2);
    }
}
