public class String_1 {

    public static void main(String[] args) {
        String str [] = {"10","010","010","010","100"};
        //StringBuilder sb = new StringBuilder();
        for(int i=0;i<str.length;i++){
            if(str[i].startsWith("1")){
                System.out.println(str[i]);
            }
        }
    }
}
