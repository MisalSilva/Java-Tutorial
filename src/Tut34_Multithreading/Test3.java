package Tut34_Multithreading;
// Executing multiple threads
class C implements Runnable{
    public void run(){
        for(int i=0; i<10; i++){
            System.out.println("Hello");
            try{
                Thread.sleep(500);
            }catch(Exception e){}
        }
    }
}
class D implements Runnable{
    public void run(){
        for(int i=0; i<10; i++){
            System.out.println("welcome");
            try{
                Thread.sleep(500);
            }catch(Exception e){}
        }
    }
}

public class Test3 {
    public static void main(String[]arg){
        C c =  new C();
        Thread t1 = new Thread(c);
        t1.start();
        try {
            Thread.sleep(50);
        }catch(Exception e){}
        D d = new D();
        Thread t2 = new Thread(d);
        t2.start();
        try{
            Thread.sleep(50);
        }catch(Exception e){}
    }
}
