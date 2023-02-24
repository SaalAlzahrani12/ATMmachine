
import java.util.Scanner;

/*

This is a BankAccount class that represents a basic bank account.

It has a constructor that sets the account name and initial balance.

It also has methods for depositing and withdrawing money, transferring money to another account,

printing account information.
 */
public class BankAccount {

// Instance variables
    protected String name; // account holder name
    protected double balance; // account balance
    protected int pass; // account password

// Constructor
    public BankAccount(String name, double balance) {
        this.name = name;
        this.balance = balance;
    }

// Method to deposit money into account
    public void deposit(double amount) {
        if (amount <= 10000) {
            balance += amount;
            System.out.println("You have deposited " + amount + " SAR. Your new balance is " + balance + " SAR.");
        } else {
            System.out.println("You cannot deposit more than 10k SAR.");
        }
    }

// Method to withdraw money from account
    public void withdraw(double amount) {
        if (amount > balance) {
            System.out.println("The balance is not enough.");
        } else if (amount > 5000) {
            System.out.println("You cannot withdraw more than 5k SAR.");
        } else {
            balance -= amount;
            System.out.println("You have withdrawn " + amount + " SAR. Your new balance is " + balance + " SAR.");
        }
    }

// Method to transfer money to another account
    public void transfer(double amount, String recipient) {
        if (amount > balance) {
            System.out.println("The balance is not enough.");
        } else {
            balance -= amount;
            System.out.println("You have transferred " + amount + " SAR to " + recipient + ".");
        }
    }

// Method to print account information
    public void printInfo() {
        System.out.println("Account name: " + name);
        System.out.println("Account balance: " + balance + " SAR.");
    }

}
