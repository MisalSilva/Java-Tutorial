package Tut23;

public class Child extends Parent {

    public void Phone(){
        System.out.println("Nokia");
    }
    public static void main(String[] args) {
        Child c = new Child();
        c.Phone();
    }
}
