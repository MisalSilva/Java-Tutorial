package Tut28_Interfaces;

public class Nimal implements Student {// In interfaces, we use 'implements'(In abstract classes we used "extends")
    @Override
    public void eat() { // overridden the eat method and created a body
        System.out.println("Eating...");
    }

    @Override
    public void sleep() { // overridden the sleep method and created a body
        System.out.println("Sleeping...");
    }

    @Override
    public void drink() { // overridden the drink method and created a body
        System.out.println("Drinking...");
    }

    public static void main(String[] args) {
        Nimal n = new Nimal(); // can create an object from the class or interface
        n.drink();
        n.sleep();
        Student s1 = new Nimal(); // object created from the interface
        s1.eat();
        System.out.println(Student.age);
        /*Student.age= 15;*/ // here we cannot change the value of the variable from the interface as it's final

    }
}
