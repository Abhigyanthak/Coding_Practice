public class StringManupulation_ClientRound_USBank {
    public static void main(String args []){
        String s = "My [name{ is( Abhiyan. I) am} a Java] Developer";
        //output = My name is Abhiyan. I am a Java Developer[{()}]
        StringBuilder brackets = new StringBuilder();
        StringBuilder text = new StringBuilder();
        for(char c : s.toCharArray()){
            if(!(Character.isAlphabetic(c) || Character.isSpaceChar(c) || c =='.')){
                brackets.append(c);
            }
            else{
                text.append(c);
            }
        }
        System.out.print(text.append(brackets));
    }
}
