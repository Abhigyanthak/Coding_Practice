public class FindVowelsInStringUsingJava8 {
    public static void main(String args []){
        String s = "abhigyan";
        s.chars()
                .filter(c -> c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u')
                .forEach(c -> System.out.println((char) c));
    }
}
