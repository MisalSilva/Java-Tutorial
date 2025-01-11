// In thi class we discuss Logical Operators
public class Tut06 {
    public static void main(String[] args) {

        int a = 10;
        int b = 20;

        if (a>0){
            System.out.println("a is positive");
        }
        if (a<0){
            System.out.println("a is negative");
        }
        if (a>0 && b>0){
            System.out.println("Positive");
        }
        if (a>0 && b<0){
            System.out.println("Negative");
        }
        if(a>0 || b>0){
            System.out.println("Both are positive");
        }
        if(a>0 || b<0){
            System.out.println("Answer is positive");
        }
        if(a<0 || b<0){
            System.out.println("Answer is negative");
        }

    }
}
