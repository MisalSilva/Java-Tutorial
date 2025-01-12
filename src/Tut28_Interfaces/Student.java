package Tut28_Interfaces;
// In this class we discuss Java Interfaces
// All the methods in an interface are abstract methods without any implementation
// Therefore there's no need to name them as 'abstract' as all the methods are abstract methods
// In interfaces there cannot be any methods with implementations
public interface Student {
    int age = 10; // Variables in interfaces will always be final even if they are not stated as 'final'

    void eat();
    void sleep();
    void drink();
}
