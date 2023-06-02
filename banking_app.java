package rv;

import java.util.Scanner;

public class banking_app {
    public static void main(String[] args) {
        BankingApplication bankingApp = new BankingApplication();
        bankingApp.start();
    }
}

class BankingApplication {
    private Bank bank;
    private Scanner scanner;

    public BankingApplication() {
        bank = new Bank();
        scanner = new Scanner(System.in);
    }

    public void start() {
        int choice;
        do {
            displayMenu();
            choice = getUserChoice();

            switch (choice) {
                case 1:
                    bank.checkBalance();
                    break;
                case 2:
                    double depositAmount = getUserInput("Enter the amount to deposit: ");
                    bank.deposit(depositAmount);
                    break;
                case 3:
                    double withdrawAmount = getUserInput("Enter the amount to withdraw: ");
                    bank.withdraw(withdrawAmount);
                    break;
                case 4:
                    transferToAnotherBankAccount();
                    break;
                case 5:
                    transferToAnotherPersonAccount();
                    break;
                case 6:
                    System.out.println("Thank you for using our banking application!");
                    break;
                default:
                    System.out.println("Invalid choice! Please try again.");
                    break;
            }
        } while (choice != 6);

        scanner.close();
    }

    private void displayMenu() {
        System.out.println("1. Check Balance");
        System.out.println("2. Deposit");
        System.out.println("3. Withdraw");
        System.out.println("4. Transfer Money to Another Bank Account");
        System.out.println("5. Transfer Money to Another Person Account");
        System.out.println("6. Exit");
    }

    private int getUserChoice() {
        System.out.print("Enter your choice: ");
        return scanner.nextInt();
    }

    private double getUserInput(String message) {
        System.out.print(message);
        return scanner.nextDouble();
    }

    private void transferToAnotherBankAccount() {
        double transferAmount = getUserInput("Enter the amount to transfer: ");
        // Logic to transfer money to another bank account
        // You can implement the required functionality here
        System.out.println("Transfer of ₹" + transferAmount + " to another bank account successful.");
    }

    private void transferToAnotherPersonAccount() {
        double transferAmount = getUserInput("Enter the amount to transfer: ");
        // Logic to transfer money to another person's account
        // You can implement the required functionality here
        System.out.println("Transfer of ₹" + transferAmount + " to another person's account successful.");
    }
}

class Bank {
    private double balance;

    public void checkBalance() {
        System.out.println("Your current balance is: ₹" + balance);
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposit of ₹" + amount + " successful.");
    }

    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Withdrawal of ₹" + amount + " successful.");
        } else {
            System.out.println("Insufficient Balance!");
        }
    }
}
