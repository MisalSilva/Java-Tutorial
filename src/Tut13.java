// In this class we discuss java String part 1
public class Tut13 {
    public static void main(String[]args){

        // Two types of String declaration

        String str1 = "Hello";
        String str2 = "Hello";

        if (str1==str2){
            System.out.println("str1 and str2 are the same");
        }

        String str3 = new String("World");
        String str4 = new String("World");

        if (str3==str4){
            System.out.println("str3 and str4 are the same");
        }
        else{
            System.out.println("str3 and str4 are not the same");
        }

        // The difference between these to types is that,
        // the first type assigns the variables to the same value and they both are the same since there's only one memory space.
        // the second type assigns variables to two different values creating two memory spaces and they are not the same.

    }
}
