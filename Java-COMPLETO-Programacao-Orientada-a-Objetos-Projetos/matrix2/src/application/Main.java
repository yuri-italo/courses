package application;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    var read = new Scanner(System.in);
	    int m = read.nextInt();
	    int n = read.nextInt();
	    int[][] mat = new int[m][n];


        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                mat[i][j] = read.nextInt();
            }
        }

        int value = read.nextInt();

        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                if (mat[i][j] == value) {
                    System.out.println("Position " + i + "," + j + ":");
                    if (j > 0)
                        System.out.println("Left: " + mat[i][j-1]);
                    if (i > 0)
                        System.out.println("Up: " + mat[i-1][j]);
                    if (j < mat[i].length-1)
                        System.out.println("Right: " + mat[i][j+1]);
                    if (i < mat.length-1)
                        System.out.println("Down: " + mat[i+1][j]);
                }
            }
        }

    }
}
