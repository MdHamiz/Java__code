package project;

import java.util.Scanner;

class AtmMachine {
    float balance;
    int PIN = 9090;

    public void checkpin() {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Enter your pin:");
            int enteredpin = sc.nextInt();
            if (enteredpin == PIN) {
                menu();
                break;
            } else {
                System.out.println("Invalid Pin! Try again.");
            }
        }
    }

    public void menu() {
        System.out.println("\nEnter Your Choice");
        System.out.println("1. Check A/C Balance");
        System.out.println("2. Withdraw Money");
        System.out.println("3. Deposit Money");
        System.out.println("4. Exit");

        Scanner sc = new Scanner(System.in);
        int opt = sc.nextInt();
        if (opt == 1) {
            checkbalance();
        } else if (opt == 2) {
            withdrawmoney();
        } else if (opt == 3) {
            deposit();
        } else if (opt == 4) {
            System.out.println("Thank you for using ATM!");
            return;
        } else {
            System.out.println("Enter a valid option!");
            menu();
        }
    }

    public void checkbalance() {
        System.out.println("Your balance: " + balance);
        menu();
    }

    public void deposit() {
        System.out.println("Enter the Amount:");
        Scanner sc = new Scanner(System.in);
        float amount = sc.nextFloat();
        balance = balance + amount;
        System.out.println("Money Deposit Successful");
        menu();
    }

    public void withdrawmoney() {
        System.out.println("Enter Amount:");
        Scanner sc = new Scanner(System.in);
        float amount = sc.nextFloat();

        if (amount > balance) {
            System.out.println("Insufficient Balance");
        } else {
            balance = balance - amount;
            System.out.println("Money Withdraw Successful");
        }
        menu();
    }
}

public class Atm {
    public static void main(String[] args) {
        AtmMachine obj = new AtmMachine();
        obj.checkpin();
    }
}
