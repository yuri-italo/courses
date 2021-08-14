package application;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        Set<Integer> classA = new HashSet<>();
        Set<Integer> classB = new HashSet<>();
        Set<Integer> classC = new HashSet<>();

        System.out.print("How many students for course A? ");
        int qtt = read.nextInt();

        for (int i = 0; i < qtt; i++) {
            int code = read.nextInt();
            classA.add(code);
        }

        System.out.print("How many students for course B? ");
        qtt = read.nextInt();

        for (int i = 0; i < qtt; i++) {
            int code = read.nextInt();
            classB.add(code);
        }

        System.out.print("How many students for course C? ");
        qtt = read.nextInt();

        for (int i = 0; i < qtt; i++) {
            int code = read.nextInt();
            classC.add(code);
        }

        Set<Integer> total;
        total = new HashSet<>(classA);
        total.addAll(classB);
        total.addAll(classC);

        System.out.println("Total students: " + total.size());
    }
}
