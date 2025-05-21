package OOPS.Polymorphism.Runtime;

public class main {
    public static void main(String[] args) {

        Animal a;

        a = new Dog();
        a.sound();

        a = new Cat();
        a.sound();
    }
}
