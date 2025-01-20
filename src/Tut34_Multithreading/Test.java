package Tut34_Multithreading;

class A extends Thread {
    // overridden the run method in the runnable interface
    public void run(){
        System.out.println("Threading using Thread class");
    }
}

public class Test {
    public static void main(String[]args){
        A obj = new A();
        obj.start();

    }
}
