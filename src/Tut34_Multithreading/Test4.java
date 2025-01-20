package Tut34_Multithreading;

class Display{
    public synchronized void print(){
        Thread t = Thread.currentThread();
        for (int i=0; i<5; i++){
            System.out.println(t.getName());
            try {
                Thread.sleep(1000);
            }catch (Exception e){}
        }
    }
}

class T implements Runnable{
    Display d;
    public T(Display d){
        this.d = d;
    }
    public void run(){
        d.print();
    }
}

public class Test4 {
    public static void main(String[] args){
        Display obj = new Display();

        T t1 = new T(obj);
        T t2 = new T(obj);
        Thread thread1 = new Thread(t1);
        Thread thread2 = new Thread(t2);
        thread1.start();
        thread2.start();



    }
}
