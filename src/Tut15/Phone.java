package Tut15;
// In this class we discuss OOP
public class Phone{
    String name;
    String color;

    public void call(){
        System.out.println("Phone call from "+name);
    }
    public void colorCall(){
        System.out.println(name+" phone is "+color);
    }

    public static void main(String[]args){

        Phone phone1 = new Phone();
        phone1.name = "samsung";
        phone1.color = "blue";
        phone1.call();
        phone1.colorCall();

    }
}

