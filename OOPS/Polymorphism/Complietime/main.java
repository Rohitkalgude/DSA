package OOPS.Polymorphism.Complietime;

public class main {
    public static void main(String[] args) {

        Compiletime calc = new Compiletime();
        System.out.println("Sum of 2 numbers: " + calc.add(10, 20));
        System.out.println("Sum of 3 numbers: " + calc.add(10, 20, 30));

    }
}
