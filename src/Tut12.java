// In this class we discuss about Break and Continue statements in java
public class Tut12 {
    public static void main(String[] args) {

        // break statement
        for (int i = 1; i<=10; i++){
            if (i==5){
                break;
            }
            System.out.println(i);
        }

        // continue statement
        for(int i = 1;i<=10;i++){
            if (i==5){
                continue;
            }
            System.out.println(i);
        }

    }
}
