package OOPS;

public class Encapsulation {

   private String name = "Rohit";
   private int age = 20;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public static void main(String[] args) {

        Encapsulation myperson = new Encapsulation();

        //Access data getters way
        System.out.println(" name "+ myperson.getName());
        System.out.println(" age "+ myperson.getAge());


        //changing data setter way
        myperson.setName("Rohit kalgude");
        myperson.setAge(22);

        System.out.println(" Update name "+ myperson.getName());
        System.out.println(" Update age "+ myperson.getAge());

    }
}
