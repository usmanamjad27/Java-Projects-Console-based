//Scenario 2: Bank Account Management System
//A bank needs a Bank Account Management System where customers can open and manage their
//accounts securely. The system should include:
//         A BankAccount class with private attributes accountNumber, balance, and accountHolderName.
// Public methods deposit(double amount), withdraw(double amount), and getBalance().
//         A SavingsAccount class that extends BankAccount and applies a withdrawal limit.
//Problem Statement:
//         Implement the BankAccount and SavingsAccount classes using Encapsulation and
//Abstraction.
// Ensure that balance updates follow data hiding principles.
//         Provide Java code demonstrating account transactions.

public class S2_Banking_Management_System {
    public static void main(String[] args) {
        S2_BankAccount obj = new S2_BankAccount("7973910781697","Usman Amjad",500);
        obj.withdraw(600);
        obj.deposit(500);

        // Creating a normal Bank Account
        S2_BankAccount account1 = new S2_BankAccount("123456", "Usman Amjad", 5000);
        account1.deposit(1000);
        account1.withdraw(2000);
        account1.withdraw(4000); // Should show insufficient funds

        System.out.println("---------------------------");

        // Creating a Savings Account with a withdrawal limit of 2000
        S2_SavingAccount savingsAccount = new S2_SavingAccount("789101", "Parichay Fatima", 10000, 2000);
        savingsAccount.deposit(500);
        savingsAccount.withdraw(3000); // Should show withdrawal limit exceeded
        savingsAccount.withdraw(1500); // Should work fine
    }
}

