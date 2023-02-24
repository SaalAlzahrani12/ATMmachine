
import java.util.Scanner; // import Scanner class

public class ATM_Machine { // create main class

    public static void main(String[] args) { // main method
        Scanner input = new Scanner(System.in); // create a Scanner object to read user input
        CheckingAccount account = new CheckingAccount("Saad Alzahrani", 10000); // create a CheckingAccount object with initial balance of 10000
        account.checkPass(); // call the checkPass() method to prompt the user for a password and check it

        while (true) { // infinite loop until user chooses to exit
            System.out.println("======================");
            System.out.println("       ANB BANK       ");
            System.out.println("======================");
            System.out.println(" > Enter (W or w) to withdraw"); // display options for user
            System.out.println(" > Enter (D or d) to deposit");
            System.out.println(" > Enter (T or t) to transfer");
            System.out.println(" > Enter (P or p) to print info");
            System.out.println(" > Enter (E or e) to exit");
            System.out.println("");
            System.out.println("  > Enter your choice: ");

            String choice = input.next(); // read user's choice

            switch (choice.toUpperCase()) { // check the user's choice (case-insensitive)
                case "W":
                    System.out.println("Enter amount of money to withdraw (up to 5000): ");
                    double amountToWithdraw = input.nextDouble(); // read amount to withdraw from user
                    account.withdraw(amountToWithdraw); // call the withdraw() method on the account object
                    break;

                case "D":
                    System.out.println("Enter amount of money to deposit (up to 10000): ");
                    double amountToDeposit = input.nextDouble(); // read amount to deposit from user
                    account.deposit(amountToDeposit); // call the deposit() method on the account object
                    break;

                case "T":
                    System.out.println("Enter amount of money to transfer: ");
                    double amountToTransfer = input.nextDouble(); // read amount to transfer from user

                    System.out.println("Enter recipient's account name: ");
                    String recipientName = input.next(); // read recipient's name from user
                    BankAccount recipient = new CheckingAccount(recipientName, 0); // create a new CheckingAccount object for the recipient with initial balance of 0
                    account.transfer(amountToTransfer, recipientName); // call the transfer() method on the account object to transfer money to the recipient
//                    ((CheckingAccount) account).transfer(amountToTransfer, recipient); // another way to call the transfer() method on the account object (cast the account object to CheckingAccount first)
                    break;

                case "P":
                    account.printInfo(); // call the printInfo() method on the account object to print account information
                    break;

                case "E":
                    System.out.println("Thank you for using ANB Bank."); // print exit message
                    System.exit(0); // exit program with code 0 (success)
                    break;
                default:
            }
        }
    }
}
