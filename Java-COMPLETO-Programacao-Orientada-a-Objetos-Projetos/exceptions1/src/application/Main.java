package application;

import entities.Account;
import exceptions.BusinessException;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        var read = new Scanner(System.in);

        System.out.println("Enter account data");
        System.out.print("Number: ");
        int accountNumber = read.nextInt();
        read.nextLine();
        System.out.print("Holder: ");
        String name = read.nextLine();
        System.out.print("Initial balance: ");
        double balance = read.nextDouble();
        System.out.print("Withdraw limit: ");
        double withdrawLimit = read.nextDouble();
        var account = new Account(accountNumber,name,balance,withdrawLimit);

        System.out.print("\nEnter amount for withdraw: ");
        double withdraw = read.nextDouble();

        try {
            account.withDraw(withdraw);
            System.out.print("New balance: " + String.format("%.2f",account.getBalance()));
        } catch (BusinessException e) {
            System.out.println(e.getMessage());
        }
    }
}
