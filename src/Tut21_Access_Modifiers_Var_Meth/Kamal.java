package Tut21_Access_Modifiers_Var_Meth;

public class Kamal  {

    public static void main(String[] args) {

        Nimal n1 =  new Nimal();
        System.out.println(n1.x); // public can be accessed
        System.out.println(n1.y); // default can be accessed
        System.out.println(n1.a); // protected can be accessed
        // private is accessible only within the class
    }
}
