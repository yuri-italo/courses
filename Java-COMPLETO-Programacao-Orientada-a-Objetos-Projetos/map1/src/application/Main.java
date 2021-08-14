package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        Map<String, Integer> votes = new LinkedHashMap<>();

        System.out.print("Enter file full path: ");
        String path = read.nextLine();

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            String line = br.readLine();

            while (line != null) {
                String[] fields = line.split(",");
                String name = fields[0];
                int numberOfVotes = Integer.parseInt(fields[1]);

                if (votes.containsKey(name)) {
                    int soFar = votes.get(name);
                    votes.put(name, numberOfVotes + soFar);
                } else {
                    votes.put(name,numberOfVotes);
                }
                line = br.readLine();
            }

            for (String key: votes.keySet()) {
                System.out.println(key + ": " + votes.get(key));
            }

        } catch (IOException e) {
            System.out.println("ERROR: " + e.getMessage());
        }
    }
}
