//In this class we discuss getting user input
import java.util.Scanner;
public class Tut02 {
    public static void main(String[] args) {

        // Creating an object for the Scanner class
        Scanner sc = new Scanner(System.in);

        // Usual variable declaration
        String name;
        int age;
        char character;
        boolean bool;
        double num;

        // Variable Declaration with Scanner object

        // for String
        String name1 = sc.nextLine();
        System.out.println("name is "+name1);
        // for Integer
        int age1 = sc.nextInt();
        System.out.println("age is "+age1);
        // for Character
        char character1 = sc.next().charAt(0);
        System.out.println("character is "+character1);
        // for Boolean
        boolean bool1 = sc.nextBoolean();
        System.out.println("bool is "+bool1);
        // for double
        double num1 = sc.nextDouble();
        System.out.println("num is "+num1);



    }
}
