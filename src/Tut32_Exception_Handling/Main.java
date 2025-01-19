package Tut32_Exception_Handling;
// In this class we discuss Java Exception Handling
import java.util.InputMismatchException;
import java.util.Scanner;
public class Main {
    public static void main(String [] arg){
        Scanner sc = new Scanner(System.in);
        int a,b,c;
        while(true){
            try{
                System.out.print("Enter a ");
                a = sc.nextInt();
                System.out.print("Enter b ");
                b = sc.nextInt();
                c = a/b;
                System.out.println("Answer is "+ c);
            }catch(ArithmeticException e){
                System.out.println("Cannot divide by zero");
            }catch(InputMismatchException e){
                System.out.println("Enter an integer");
            }catch(Exception e){
                System.out.println(e);
            }break;
        }

    }
}
