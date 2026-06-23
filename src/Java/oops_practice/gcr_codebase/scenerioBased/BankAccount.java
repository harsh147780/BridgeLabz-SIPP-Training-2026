package Java.oops_practice.gcr_codebase.scenerioBased;

public class BankAccount {

    private String accountNumber;
    private String accountHolder;
    private double balance;


    private static int totalAccounts = 0;


    public BankAccount(String accountNumber, String accountHolder, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
        totalAccounts++;
    }


    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited Amount: " + amount);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }


    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn Amount: " + amount);
        } else {
            System.out.println("Insufficient Balance! Current Balance: " + balance);
        }
    }


    public void getStatement() {
        System.out.println("Account Number : " + accountNumber);
        System.out.println("Account Holder : " + accountHolder);
        System.out.println("Balance         : " + balance);
        System.out.println();
    }


    public static void main(String[] args) {


        BankAccount a1 = new BankAccount("101", "Rahul", 10000);
        BankAccount a2 = new BankAccount("102", "Priya", 15000);
        BankAccount a3 = new BankAccount("103", "Amit", 20000);


        a1.deposit(2000);
        a1.withdraw(1000);
        a1.deposit(500);
        a1.withdraw(3000);
        a1.withdraw(10000);

        a2.deposit(1000);
        a2.withdraw(2000);
        a2.deposit(3000);
        a2.withdraw(5000);
        a2.withdraw(20000);


        a3.deposit(4000);
        a3.withdraw(5000);
        a3.deposit(2000);
        a3.withdraw(10000);
        a3.withdraw(15000);


        System.out.println("Account Statements ");
        a1.getStatement();
        a2.getStatement();
        a3.getStatement();


        System.out.println("Total Accounts Created: " + totalAccounts);
    }
}