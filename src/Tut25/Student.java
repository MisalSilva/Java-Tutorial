package Tut25;
// In this class we discuss java this keyword
// this keyword helps to distinguish between local variable and variables passed in the method as parameters
public class Student {
    String name;
    int age;

//    public Student(String x, int y){
//        name = x;
//        age = y;
//    }
    public Student(String name,int age){
        this.name = name; // this keyword accesses the name variable defined at the top of the class not the ones passed as parameters
        this.age = age; // accesses the age variable defined at the top of the class not the ones passed as parameters
    }

    public static void main(String[] args) {
        Student s1 = new Student("John Smith", 18);
        System.out.println(s1.name);
        System.out.println(s1.age);
    }

}
