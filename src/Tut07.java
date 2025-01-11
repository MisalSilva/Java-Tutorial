// In this class we discuss Java Switch case statement
public class Tut07 {
    public static void main(String[] args) {

        int weekday = 7;

        switch(weekday){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Try again");
        }

        String day = "Tuesday";

        switch(day){
            case "Monday":
            case "Tuesday":
            case "Wednesday":
            case "Thursday":
            case "Friday":
                System.out.println("School");
                break;
            case "Saturday":
            case "Sunday":
                System.out.println("Class");
                break;
            default:
                System.out.println("Try again");
        }



    }
}
