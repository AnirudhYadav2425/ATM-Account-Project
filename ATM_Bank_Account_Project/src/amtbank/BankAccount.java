package amtbank;

import java.util.ArrayList;

public class BankAccount 
{
    private double balance;
    private final int pin;
    private final ArrayList<String> transactionHistory = new ArrayList<>();

    public BankAccount(double balance, int pin) 
    {
        this.balance = balance;
        this.pin = pin;
    }

    public boolean verifyPin(int userPin) 
    {
        return this.pin == userPin;
    }

    public void checkBalance() 
    {
        System.out.println("Your balance is: Rs. " + balance);
    }

    public void deposit(double amount) 
    {
        if (amount > 0) {
            balance += amount;
            transactionHistory.add("Deposited: Rs. " + amount);
            System.out.println("Deposited: Rs. " + amount);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    public void withdraw(double amount) 
    {
        if (amount > 0 && amount <= balance) 
        {
            balance -= amount;
            transactionHistory.add("Withdrawn: Rs. " + amount);
            System.out.println("Withdrawn: Rs. " + amount);
        } else {
            System.out.println("Insufficient balance or invalid amount.");
        }
    }

    public void showTransactionHistory() 
    {
        if (transactionHistory.isEmpty()) 
        {
            System.out.println("No transactions yet.");
        } 
        else 
        {
            System.out.println("Transaction History:");
            for (String transaction : transactionHistory) 
            {
                System.out.println(transaction);
            }
        }
    }
}
