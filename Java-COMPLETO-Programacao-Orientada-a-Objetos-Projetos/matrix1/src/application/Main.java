package application;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    var read = new Scanner(System.in);
	    int negQtt = 0;
	    int matrizSize = read.nextInt();
	    int[][] matriz = new int[matrizSize][matrizSize];

        for (int i = 0; i < matrizSize; i++) {
            for (int j = 0; j < matrizSize; j++) {
                matriz[i][j] = read.nextInt();
            }
        }

        System.out.println("\nMain diagonal:");

        for (int i = 0; i < matrizSize; i++) {
            System.out.print(matriz[i][i] + " ");
        }

        for (int i = 0; i < matrizSize; i++) {
            for (int j = 0; j < matrizSize; j++) {
                if (matriz[i][j] < 0)
                    negQtt++;
            }
        }

        System.out.println("\nNegative numbers = " + negQtt);
    }
}
