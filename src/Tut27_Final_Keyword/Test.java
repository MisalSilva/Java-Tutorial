package Tut27_Final_Keyword;
// In this class we discuss java final keyword
/*final*/public class Test { // if stated final won't be able to inherit from this class
    /*final*/public void say(){ // if stated final won't be able to access from the child class
        System.out.println("Hello World");
    }

    public static void main(String[] args) {
        final double g = 9.81;
//        g=10; // can do changes to g if not stated as final
        System.out.println(g);
    }
}
