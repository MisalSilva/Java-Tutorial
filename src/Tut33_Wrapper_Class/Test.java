package Tut33_Wrapper_Class;
// In this class we discuss Java Wrapper Class
// All Primitive data types have a wrapper class of their own
// We use them to create object as we cannot create objects from primitive data types
public class Test {
    public static void main(String[] args) {
        String x = "String";// Non primitive data type
        int y = 10;// primitive data type
        System.out.println(x.toLowerCase()); // a method from the string class is used by an object of x variable
        // we cannot create objects from non-primitive data types
        // To do that e use Wrapper class
        Integer a = new Integer(20); // created an object from Integer Wrapper class
        System.out.println(a);
//        Integer b = new Integer(10); // other ways to create an object from Integer Wrapper class
        Integer b = 12; // created an object from Integer Wrapper class
//        Integer b = Integer.valueOf(13); // other ways to create an object from Integer Wrapper class
        System.out.println(b);
        Double c = 3.4;

        // When using wrapper class we can create empty(null) variables
        //int d = ; cannot create empty variables
        Integer e = null; // can create null variables

        // converting primitive data types into objects (Wrapping, Boxing)

        int f = 15;
        Integer g = Integer.valueOf(f); // boxing, wrapping
        Integer h = f; // Auto Boxing, Wrapping (compiler automatically calls the 'valueof' method of the Integer class)

        // wrapper class objects into primitive data types (Unwrapping, Unboxing)

        Integer i = 40;
        int j = i.intValue(); // // Unboxing, Unwrapping (i's integer value is called to j)
        int k  = i; // Auto Unboxing, Unwrapping (Compiler gets the integer value of the i object automatically)

    }
}
