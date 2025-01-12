package Tut16;
// In this class we discuss Static keyword in java
public class Test {

    String name;

    void call(){
        System.out.println("Make a call from "+name);
    }
    void browser(String browserName){
        System.out.println("Browser the internet from "+browserName);
    }

    public static void main(String[] args) {
        Test phone1 = new Test();
        Test phone2 = new Test();
        phone1.name = "Samsung";
        phone2.name = "Apple";
        phone2.call();
        phone2.browser("Safari");
        phone1.call();
        phone1.browser("Google");
    }
}
