package Tut30_Super_keyword;

class Student{
    int age;
    String name;
    String school;

    public Student(int age, String name, String school) {
        this.age = age;
        this.name = name;
        this.school = school;
    }
}
class Kamal extends Student{
    int year;
    public Kamal(int age, String name, String school, int year) {
        super(age,name,school);
        this.year = year;
    }

}
public class Examplee {
    public static void main(String[] args) {
        Kamal kamal = new Kamal(18, "Kamal", "ABCD",2025);
        System.out.println(kamal.name);
        System.out.println(kamal.year);
    }
}
