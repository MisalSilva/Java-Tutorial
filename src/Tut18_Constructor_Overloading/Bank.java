package Tut18_Constructor_Overloading;
// In this class we discuss constructor overloading
public class Bank {
    int rupees;

    public Bank(){
        rupees = 0;
        System.out.println("Nimal Bank");
    }
    public Bank(int x){
        rupees = x;
        System.out.println("Kamal Bank");
    }

    public static void main(String[]args){
        Bank nimal = new Bank(); // here nimal used the constructor with no parameters
        System.out.println("Nimal's bank acct balance is "+nimal.rupees);

        Bank kamal = new Bank(1000); // here kamal used the constructor with x as the parameter
        System.out.println("kamal's bank acct balance is "+kamal.rupees);

    }

}
