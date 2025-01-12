package Tut26;

public class Student {
    private String name; // cannot be accessed, must create getter and setter to be able to write and read
    private int age; // cannot be accessed, must create getter and setter to be able to write and read
    int Id; // can be accessed through any class

//    public void setName(String x) {
//        name = x;
//    }
    public void setName(String name){
        this.name = name;
    }
    public String getName() {
        return name;
    }
}
