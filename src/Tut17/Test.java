package Tut17;
// In this class we discuss java constructors
public class Test {
    // The constructor is the same as the class name
    // It has no return type
    // It will be automatically called when an object is created
    String name;
    public Test() {
        name = "nimal";
        System.out.println("welcome");
    }

    void meth(){
        System.out.println("meth");
    }

    public static void main(String[] args) {
        Test test1 = new Test(); // welcome will be printed since the constructor is always automatically called
        test1.meth(); // meth will be printed
        System.out.println(test1.name); // value of the variable name is assigned in the constructor

        Test test2 = new Test();
        test2.meth();
        System.out.println(test2.name);



    }
}
