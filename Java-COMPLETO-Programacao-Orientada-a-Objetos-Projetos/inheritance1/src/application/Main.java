package application;

import entities.ImportedProduct;
import entities.Product;
import entities.UsedProduct;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws ParseException {
	    var read = new Scanner(System.in);
	    var sdf = new SimpleDateFormat("dd/MM/yyyy");
        List<Product> list = new ArrayList<>();

        System.out.print("Enter the number of products: ");
        int productsQtt = read.nextInt();
        read.nextLine();

        for (int i = 1; i <= productsQtt; i++) {
            label:
            while (true) {
                System.out.println("Product #" + i + " data:");
                System.out.print("Common, used or imported (c/u/i)? ");
                String answer = read.nextLine();

                switch (answer.toUpperCase()) {
                    case "C":
                        System.out.print("Name: ");
                        String name = read.nextLine();
                        System.out.print("Price: ");
                        double price = read.nextDouble();
                        read.nextLine();
                        list.add(new Product(name,price));
                        break label;
                    case "U":
                        System.out.print("Name: ");
                        name = read.nextLine();
                        System.out.print("Price: ");
                        price = read.nextDouble();
                        read.nextLine();
                        System.out.print("Manufacture date (DD/MM/YYYY): ");
                        Date date = sdf.parse(read.nextLine());
                        list.add(new UsedProduct(name,price,date));
                        break label;
                    case "I":
                        System.out.print("Name: ");
                        name = read.nextLine();
                        System.out.print("Price: ");
                        price = read.nextDouble();
                        read.nextLine();
                        System.out.print("Customs fee: ");
                        double customsFee = read.nextDouble();
                        read.nextLine();
                        list.add(new ImportedProduct(name,price,customsFee));
                        break label;
                    default:
                        System.out.println("Enter a valid option!");
                        break;
                }
            }
        }
        System.out.println("\nPRICE TAGS: ");
        for (Product i : list) {
            System.out.println(i.priceTag());
        }
    }
}
