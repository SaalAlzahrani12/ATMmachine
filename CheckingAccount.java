
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author rexxr
 */
public class CheckingAccount extends BankAccount {

    public CheckingAccount(String name, double balance) {
        super(name, balance);
    }

//    public void transfer(double amount, BankAccount recipient) {
//        if (amount > balance) {
//            System.out.println("Insufficient balance.");
//        } else {
//            balance -= amount;
//            recipient.deposit(amount);
//            System.out.println("You have transferred " + amount + " SAR to " + recipient.name + ".");
//        }
//    }

    public void checkPass() { // method to check password
    Scanner passw = new Scanner(System.in); // create a Scanner object to read user input
    int attempts = 3; // set number of password attempts
    boolean passwordCorrect = false; // initialize boolean variable to track whether password is correct

    while (attempts > 0 && !passwordCorrect) { // loop until correct password or no more attempts
        System.out.println("Enter password (you have " + attempts + " attempts left): "); // prompt user to enter password
        int inputPassword = passw.nextInt(); // read user input as integer
        if (inputPassword == 1727) //الرقم السري بمناسبة يوم التأسيس
        { // check if password is correct
            passwordCorrect = true; // set boolean variable to true to indicate correct password
            System.out.println("Password accepted!"); // print confirmation message
        } else {
            System.out.println("Incorrect password. Please try again."); // print error message
            attempts--; // decrement number of remaining attempts
        }
    }

    if (!passwordCorrect) { // check if all attempts have been used without success
        System.out.println("No attempts remaining. Exiting program."); // print error message
        System.exit(0); // exit program with code 0 (success)
    }
}
}

