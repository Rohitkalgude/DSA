package OOPS.Inheritance;

public class Dog extends Animal{

    @Override
    void sound() {
        System.out.println("Dog barks");
    }

    void name(){
        System.out.println("Dog name bulldog");
    }
}
