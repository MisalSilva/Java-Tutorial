package Tut16;
// In this class we discuss Static keyword in java
public class Test {
// You can access static variables and methods only from static classes (ex. main class)
// If you want to access non-static variables and methods from static classes you need to create objects (ex. obj from test class)

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
