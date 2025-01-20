package Tut34_Multithreading;

class B implements Runnable {
    // overridden the run method in the runnable interface
    public void run(){
        System.out.println("Threading using Runnable Interface");
    }
}
public class Test2 {
    public static void main(String[] args){
        B obj = new B();
        Thread t1 = new Thread(obj);
        t1.start(); // can call the start() from the object we created from the Thread class

    }
}
