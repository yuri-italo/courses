package application;

import entities.Account;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    var read = new Scanner(System.in);


        System.out.print("Enter account number: ");
	    int accountNumber = read.nextInt();
        read.nextLine();

        System.out.print("Enter account Holder: ");
        String holder = read.nextLine();
        var account = new Account(accountNumber,holder);

        while (true) {
            System.out.print("Is there initial deposit (y/n)? ");
            String answer = read.nextLine();
            if (answer.equalsIgnoreCase("Y")) {
                System.out.print("Enter initial deposit value: ");
                double deposit = read.nextDouble();
                account.toDeposit(deposit);
                break;
            } else if (answer.equalsIgnoreCase("N")) {
                break;
            } else {
                System.out.println("invalid answer");
            }
        }

        System.out.println("\nAccount data: \n" + account);

        System.out.print("\nEnter a deposit value: ");
        double deposit = read.nextDouble();
        account.toDeposit(deposit);

        System.out.println("Updated account data: \n" + account);

        System.out.print("\nEnter a withdraw value: ");
        double withdraw = read.nextDouble();
        account.toWithdraw(withdraw);

        System.out.println("Updated account data: \n" + account);
    }
}
