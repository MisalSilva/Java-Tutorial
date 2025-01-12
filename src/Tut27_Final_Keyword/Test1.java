package Tut27_Final_Keyword;

public class Test1 extends Test{
    public void say(){
        System.out.println("Hellow");
    } // won't be able to override if the method is named final the parent class

    public static void main(String[] args) {
        Test1 test = new Test1();
        test.say();
    }
}
