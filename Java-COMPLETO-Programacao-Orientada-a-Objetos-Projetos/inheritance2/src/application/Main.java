package application;

import entities.Company;
import entities.Individual;
import entities.TaxPayer;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        var read = new Scanner(System.in);
        List<TaxPayer> list = new ArrayList<>();
        String answer;

        System.out.print("Enter the number of tax payers: ");
        int n = read.nextInt();
        read.nextLine();
        for (int i = 1; i <= n; i++) {
            System.out.println("Tax payer #" + i + " data: ");
            while (true) {
                System.out.print("Individual or company (i/c)? ");
                answer = read.nextLine();
                if (answer.equalsIgnoreCase("I") || answer.equalsIgnoreCase("C"))
                    break;
                else
                    System.out.println("Enter a valid answer");
            }
            System.out.print("Name: ");
            String name = read.nextLine();
            System.out.print("Anual income: ");
            double anualIncome = read.nextDouble();

            if (answer.equalsIgnoreCase("I")) {
                System.out.print("Health expenditures: ");
                double healthExpenditures = read.nextDouble();
                read.nextLine();
                list.add(new Individual(name,anualIncome,healthExpenditures));
            } else {
                System.out.print("Number of employees: ");
                int numberOfEmployees = read.nextInt();
                read.nextLine();
                list.add(new Company(name,anualIncome,numberOfEmployees));
            }
        }

        System.out.println("\nTAXES PAID: ");
        double sum=0;
        for (TaxPayer payer: list) {
            System.out.println(payer);
            sum += payer.tax();
        }
        System.out.printf("\nTOTAL TAXES: $ %.2f", sum);
    }
}
