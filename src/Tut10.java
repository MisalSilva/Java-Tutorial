// In this class we discuss java Arrays
public class Tut10 {
    public static void main(String[] args){

        String[] names = {"kamal","namal","gota"};
        System.out.println(names[0]);
        names [0] = "maina";
        System.out.println(names[0]);
        System.out.println(names[1]);

        // Defining arrays length on the start
        int[] numbers = new int[5];
        numbers[0] = 100;
        numbers[1] = 200;
        numbers[2] = 300;
        numbers[4] = 500;
        System.out.println(numbers[0]);
        System.out.println(numbers[3]);
        System.out.println(numbers[4]);

        // Java 2D Arrays

        int[][] num = {
                {1,2,3},
                {4,5,6},
                {7,8,9}}
                ; // this 2D array has 3 rows and 3 columns
        System.out.println(num[0][0]); // prints element '1'
        // To access element '4'
        System.out.println(num[1][0]);

    }
}
