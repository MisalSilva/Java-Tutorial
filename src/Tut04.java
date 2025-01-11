// In this class we discuss java Assignment Operators
public class Tut04 {
    public static void main(String[] args) {
        // Increment
        int x = 10;
        x = x + 1;
        System.out.println(x);

        x += 5; //x = x + 5
        System.out.println(x);

        x -= 5; //x = x -5
        System.out.println(x);

        x *= 5; // x = x * 5
        System.out.println(x);

        x /= 5; //x = x / 5
        System.out.println(x);

        x %= 5; //  x = x % 5
        System.out.println(x);

        int y = 20;
        y++;
        System.out.println(y);
        // Decrement
        int a = 10;
        a  = a -1;
        System.out.println(a);
        int b = 20;
        b--;
        System.out.println(b);

        // Post Increment VS Pre Increment

        // Post Increment
        int p  = 10;
        int q  = p++;  // here the s is first assigned to 'r' before r is incremented. therefore it's value is 10
        System.out.println(q);
        System.out.println(p);

        // Pre Increment
        int r  = 10;
        int s  = ++r; // here the s is  assigned to the incremented value of 'r'. therefore it's value is 11
        System.out.println(s);
        System.out.println(r);




    }
}
