public class CodingSnipet {

    public static void main(String args []){
        new Child();
    }
}
class Parent{
    static {
        System.out.println("Parent class static block");
    }
    {
        System.out.println("Parent class instance block");
    }
    public Parent(){
        System.out.println("Parent class constructor");
    }
}
class Child extends Parent{
    static {
        System.out.println("Child class static block");
    }
    {
        System.out.println("Child class instance block");
    }
    public Child(){
        System.out.println("Child class constructor");
    }
}
