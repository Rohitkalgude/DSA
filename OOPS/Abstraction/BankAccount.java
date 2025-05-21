package OOPS.Abstraction;

public abstract class BankAccount {

    public void openAccount(){
        System.out.println("Account Open Successfully");
    }

    public abstract void calculateInterest();
}
