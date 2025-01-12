package Tut19;
// In this class we discuss Java Inheritance
// Single Inheritance - when there's only one parent(super) class and one child(sub) class
// Multilevel Inheritance - when a super class has a sub class and that sub class has a sub class of it's own
// Hierarchical Inheritance - when there's only one parent class and two child classes both inheriting from the same super class
public class OldPhone {
    String name;
    int manufacturer;

    void call(){
    }
    void message(){
    }

    public static void main(String[] args) {
        OldPhone obj1 = new OldPhone();
        obj1.call();
        obj1.message();
    }
}
