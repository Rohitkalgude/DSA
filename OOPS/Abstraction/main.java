package OOPS.Abstraction;

public class main {
    public static void main(String[] args) {

        BankAccount acc1 = new SavingsAccount();
        acc1.openAccount();
        acc1.calculateInterest();

        BankAccount acc2 = new FixedDepositAccount();
        acc2.openAccount();
        acc2.calculateInterest();
    }
}
