package Tut22;
// In this class we discuss Method Overloading in polymorphism
// The number of variables passed or variable's data types should be different
public class Meth_Overloading {

    public void meth(){
        System.out.println("Method 1");
    }
    public void meth(int x){
        System.out.println("Method 2");
    }
    public void meth(int a, int b){
        System.out.println("Method 3");
    }
    public void meth(double z){
        System.out.println("Method 4");
    }

    public static void main(String[] args) {
        Meth_Overloading obj = new Meth_Overloading();
        obj.meth(); // method 1 is printed as there's no parameters passed
        obj.meth(1); // method 2 is printed as an int value is passed
        obj.meth(2,3); // method 3 is printed as two int values are passed
        obj.meth(4.45); // method 4 is printed as a double is passed
    }
}
