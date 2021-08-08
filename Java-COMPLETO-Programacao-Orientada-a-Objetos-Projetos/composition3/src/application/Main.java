package application;

import entities.Client;
import entities.Order;
import entities.OrderItem;
import entities.Product;
import entities.enums.OrderStatus;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws ParseException {
        var read = new Scanner(System.in);
        var sdf = new SimpleDateFormat("dd/MM/yyyy");

        System.out.println("Enter cliente data: ");
        System.out.print("Name: ");
        String name = read.nextLine();
        System.out.print("Email: ");
        String email = read.nextLine();
        System.out.print("Birth date (DD/MM/YYYY): ");
        Date birth = sdf.parse(read.next());
        Client costumer = new Client(name,email,birth);

        System.out.println("Enter order data: ");
        System.out.print("Status: ");
        OrderStatus status = OrderStatus.valueOf(read.next());
        Order order = new Order(new Date(),status,costumer);

        System.out.print("How many items to this order? ");
        int numberOfItems = read.nextInt();
        read.nextLine();

        for (int i = 1; i <= numberOfItems; i++) {
            System.out.println("Enter #" + i + " data: ");
            System.out.print("Product name: ");
            String productName = read.nextLine();
            System.out.print("Product price: ");
            double price = read.nextDouble();

            Product product = new Product(productName, price);

            System.out.print("Quantity: ");
            int qtt = read.nextInt();
            read.nextLine();

            OrderItem orderItem = new OrderItem(qtt,price,product);

            order.addItem(orderItem);
        }

        System.out.println("\nORDER SUMMARY: ");
        System.out.println(order);
    }
}
