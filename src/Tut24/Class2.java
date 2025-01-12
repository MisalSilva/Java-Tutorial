package Tut24;

public class Class2 extends Class1 {

    void drink(){
        System.out.println("Drinking");
    }
    // a value must be assigned to the abstract method
    @Override
    void run() {
        System.out.println("running");
    }

    public static void main(String[] args) {
        Class2 c2 = new Class2();
        c2.drink();
        c2.run(); // Afterward abstract method can be accessed
        c2.eat(); // Afterward non-abstract classes can be accessed as well

    }
}
