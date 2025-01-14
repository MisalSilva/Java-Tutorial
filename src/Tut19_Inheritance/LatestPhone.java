package Tut19_Inheritance;

public class LatestPhone extends NewPhone{

    void camera(){
    }

    public static void main(String[] args) {
        LatestPhone obj3 = new LatestPhone();
        obj3.call();
        obj3.message();
        obj3.browserInternet();
        obj3.camera();

    }
}
