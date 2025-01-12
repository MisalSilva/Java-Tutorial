package Tut19;

public class NewPhone extends OldPhone{

    void browserInternet(){
    }

    public static void main(String[] args) {
        NewPhone obj2 = new NewPhone();
        obj2.call();
        obj2.message();
        obj2.browserInternet();

    }
}
