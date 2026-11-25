public class Epam_Coding_Question {

    public static void main(String[] args) {

        String str [] = {"abc","def","ghi","jkliii","mnoo"};
        int longestLength = str[0].length();
        for(String s : str){
            if(s.length()>longestLength){
                longestLength = s.length();
                System.out.println(s);
            }
        }
    }

}
