package Tut30_Super_keyword;

class  A{
    int x = 10;
}
class B extends A{
    int x = 20; // x variable overridden
    public void print(){
        System.out.println(super.x);
    }
}
class C{
    void show(){
        System.out.println("Hi");
    }
}
class D extends C{
    void show(){ // show method overridden
        super.show(); // show method in class C is called by the super keyword
        System.out.println("Hello");
    }
}

public class Example {
    public static void main(String[] args) {
        B obj = new B();
        System.out.println(obj.x);
        obj.print(); // print method has called the x in the clas A from the super keyword
        D obj2 = new D();
        obj2.show();
    }
}
