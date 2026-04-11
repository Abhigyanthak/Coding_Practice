public class StringCode {
    public static void main(String args []){
        String s = "applicationjavastarted";
        String java = s.substring(11,15);
        String s2 = java.substring(0,1).toUpperCase()+java.substring(1).toLowerCase();
        String application = s.substring(0,11);
        String s3 = application.substring(0,1).toUpperCase()+application.substring(1).toLowerCase();
        String started = s.substring(15);
        String s4 = started.substring(0,1).toUpperCase()+started.substring(1).toLowerCase();
        System.out.println(s2+s3+s4);
    }
}
