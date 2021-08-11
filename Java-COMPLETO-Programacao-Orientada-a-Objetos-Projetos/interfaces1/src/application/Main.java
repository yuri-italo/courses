package application;

import entities.Contract;
import entities.Installment;
import services.ContractService;
import services.PaypalService;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Scanner read = new Scanner(System.in);

        System.out.println("Enter contract data: ");
        System.out.print("Number: ");
        Integer number = read.nextInt();
        System.out.print("Date (dd/MM/yyyy): ");
        Date date = sdf.parse(read.next());
        System.out.print("Contract value: ");
        Double totalValue = read.nextDouble();

        Contract contract = new Contract(number,date,totalValue);

        System.out.print("Enter number of installments: ");
        int n = read.nextInt();

        ContractService cs = new ContractService(new PaypalService());

        cs.processContract(contract,n);

        System.out.println("Installments: ");
        for (Installment it: contract.getInstalments()) {
            System.out.println(it);
        }

        read.close();
    }
}
