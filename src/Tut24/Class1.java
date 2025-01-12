package Tut24;
// In this class we discuss Abstract classes and Methods in Abstraction
// Abstract class are classes that contain at least one abstract method which is an empty method with no implementation
// Objects cannot be created for abstract classes
// For another class to inherit from it a value must be assigned to that abstract method in the subclass using overriding
abstract public class Class1 {

    abstract void run();

    void eat(){
        System.out.println("eating");
    }

    public static void main(String[] args) {
        //Class1 cl = new Class1(); // Objects cannot be created from abstract classes
    }

}
