package Tut21;
// In this class we discuss java Access modifiers in variables and methods
public class Nimal {

    public int x; // accessible from anywhere
    int y; // accessible within the same package
    private int z; // accessible within the class only
    protected int a; // accessible within the package and from sub, child classes

    public static void main(String[] args) {
        Nimal n = new Nimal();
        System.out.println(n.a);
        System.out.println(n.x);
        System.out.println(n.y);
        System.out.println(n.z);
    }
}
