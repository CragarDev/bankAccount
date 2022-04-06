
public class BankAccount {

    // Create a BankAccount class.
    // The class should have the following attributes:
    // (double) checking balance, (double) savings balance.

    // Users should not be able to set any of the attributes from the class.
    // member variables
    private double checkingBal;
    private double savingsBal;

    // NINJA BONUS: Add the the following class attribute: account number.
    // The type is up to you, can be a String or a Long or another type.
    private long accountNumber;

    // Create a class member (static) that has the number of accounts created thus
    // far.
    // Track total amount of accounts
    static int numOfAccounts = 0;

    // Create a class member (static) that tracks the total amount of money stored
    // in every account created.
    // Track total amount of monies stored in all accounts
    static double totalMonies = 0;

    // Constructor
    public BankAccount() {
        // Track all accounts as they are created
        // In the constructor, be sure to increment the account count.
        numOfAccounts += 1;
        this.getAccountNumber();
    }

    // Create a method to see the total money from the checking and saving.
    // get both check and savings balances
    public void allBal() {
        double all = this.checkingBal + this.savingsBal;
        System.out.println("");
        System.out.println("::::::::::::::::::::::::::::::::::::::::::");
        System.out.println("=== acct - " + this.accountNumber + " ===");
        System.out.printf("Total balance Checking and Savings: $%.2f%n", all);
        System.out.println("::::::::::::::::::::::::::::::::::::::::::");
        System.out.println("");
    }

    // Create a method that will allow a user to deposit money into
    // either the checking or saving, be sure to add to total amount stored.
    // Deposit to either the checking or savings
    public void deposit(String account, double amount) {
        if (account == "checking") {
            this.checkingBal += amount;
            totalMonies += amount;
            System.out.println("");
            System.out.println("::::::::::::::::::::::::::::::::::::::::::");
            System.out.println("=== acct - " + this.accountNumber + " ===");
            System.out.printf("You have made a deposit into\n%s account\nin the amount of $%.2f%n", account,
                    amount);
            System.out.printf("\nCurrent %s balance is: $%.2f%n", account, this.checkingBal);
            System.out.println("::::::::::::::::::::::::::::::::::::::::::");
            System.out.println("");

        } else if (account == "savings") {
            this.savingsBal += amount;
            totalMonies += amount;
            System.out.println("");
            System.out.println("::::::::::::::::::::::::::::::::::::::::::");
            System.out.println("=== acct - " + this.accountNumber + " ===");
            System.out.printf("You have made a deposit into\n%s account\nin the amount of $%.2f%n", account,
                    amount);
            System.out.printf("\nCurrent %s balance is: $%.2f%n", account, this.savingsBal);
            System.out.println("::::::::::::::::::::::::::::::::::::::::::");
            System.out.println("");
        } else {
            System.out.println("Must enter either 'checking' or 'savings' account");
        }
    }

    // Create a method to withdraw money from one balance.
    // Do not allow them to withdraw money if there are insufficient funds.
    // Withdraw from either the checking or savings
    public void withdraw(String account, double amount) {
        if (account == "checking") {
            if (this.checkingBal < amount) {
                System.out.println("You don't have any money");
                // return;
            } else {
                this.checkingBal -= amount;
                totalMonies -= amount;
                System.out.println("");
                System.out.println("::::::::::::::::::::::::::::::::::::::::::");
                System.out.println("=== acct - " + this.accountNumber + " ===");
                System.out.printf("You have made a withdrawal from\n%s account\nin the amount of $%.2f%n", account,
                        amount);
                System.out.printf("\nCurrent %s balance is: $%.2f%n", account, this.checkingBal);
                System.out.println("::::::::::::::::::::::::::::::::::::::::::");
                System.out.println("");
            }
        } else if (account == "savings") {
            if (this.savingsBal < amount) {
                System.out.println("You don't have any money");
            } else {
                this.savingsBal -= amount;
                totalMonies -= amount;

                System.out.println("::::::::::::::::::::::::::::::::::::::::::");
                System.out.println("=== acct - " + this.accountNumber + " ===");
                System.out.printf("You have made a withdrawal from\n%s account\nin the amount of $%.2f%n", account,
                        amount);
                System.out.printf("\nCurrent %s balance is: $%.2f%n", account, this.savingsBal);
                System.out.println("::::::::::::::::::::::::::::::::::::::::::");
                System.out.println("");
            }
        } else {
            System.out.println("Must enter either 'checking' or 'savings' account");
        }
    }

    // Create a getter method for the user's checking account balance.
    // getter for checking balance
    public double getCheckingBalance() {
        System.out.println(accountNumber);
        System.out.println("Total balance from Checking: " + this.checkingBal);
        return this.checkingBal;

    }

    // Create a getter method for the user's saving account balance.
    // getter for savings balance
    public double getSavingsBalance() {
        System.out.println("Total balance from 'Savings': " + this.savingsBal);
        return this.savingsBal;
    }

    // NINJA BONUS: Create a private method that returns a random ten digit account
    // number.
    private long getAccountNumber() {
        accountNumber = (long) (Math.random() * 10000000000L);
        return accountNumber;
    }
}
