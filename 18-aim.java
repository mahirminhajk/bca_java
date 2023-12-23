// Create a class Account to deposit and withdraw money from a bank. Create a user 
// defined exception “MinBalExp‟ to be invoked when the withdrawal amount is 
// greater than balance.


import java.util.Scanner;

class MinBalExp extends Exception {
    public MinBalExp(String message) {
        super(message);
    }
}

class Account {
    private String accountNumber;
    private double balance;

    public Account(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Amount " + amount + " deposited successfully. New balance: " + balance);
    }

    public void withdraw(double amount) throws MinBalExp {
        if (amount > balance) {
            throw new MinBalExp("Insufficient balance. Available balance: " + balance);
        }

        balance -= amount;
        System.out.println("Amount " + amount + " withdrawn successfully. New balance: " + balance);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter account number: ");
        String accountNumber = scanner.nextLine();

        System.out.print("Enter initial balance: ");
        double initialBalance = scanner.nextDouble();

        Account account = new Account(accountNumber, initialBalance);

        System.out.print("Enter amount to deposit: ");
        double depositAmount = scanner.nextDouble();
        account.deposit(depositAmount);

        System.out.print("Enter amount to withdraw: ");
        double withdrawAmount = scanner.nextDouble();
        try {
            account.withdraw(withdrawAmount);
        } catch (MinBalExp exception) {
            System.out.println("Exception caught: " + exception.getMessage());
        }
    }
}