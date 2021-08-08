package application;

import entities.Room;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        var read = new Scanner(System.in);
        Room[] rooms = new Room[10];

        System.out.print("How many rooms will be rented? ");
        int roomQtt = read.nextInt();
        read.nextLine();
        for (int i=0;i<roomQtt;i++) {
            System.out.println("\nRent #" + (i+1) + ":");
            System.out.print("Name: ");
            String name = read.nextLine();
            System.out.print("Email: ");
            String email = read.nextLine();
            System.out.print("Room: ");
            int roomNumber = read.nextInt();
            read.nextLine();
            rooms[roomNumber] = new Room(name, email, roomNumber);
        }

        System.out.println("\nBusy rooms: ");
        for (Room room : rooms) {
            if (room != null)
                System.out.println(room.getRoomNumber() + ": " + room.getHolder() + ", " + room.getEmail());
        }

    }
}
