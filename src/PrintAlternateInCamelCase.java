public class PrintAlternateInCamelCase {
    public static void main(String args []){
        String s = "Abhigyan";
        char ch;
        boolean flag = true;
        StringBuilder stringBuilder = new StringBuilder();
        for(int i=0; i<s.length(); i++) {
            ch=s.charAt(i);
            if(flag){
                stringBuilder.append(Character.toUpperCase(ch));
            } else {
                stringBuilder.append(Character.toLowerCase(ch));
            }
            flag = !flag;
        }
        System.out.println(stringBuilder);
    }
}
