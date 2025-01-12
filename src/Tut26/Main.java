package Tut26;

public class Main {
    public static void main(String[] args) {
        Student obj = new Student();
        System.out.println(obj.Id); // can be accessed
        obj.setName("James"); // can be allowed to write through setter
        System.out.println(obj.getName()); // can be allowed to read through getter
    }
}
