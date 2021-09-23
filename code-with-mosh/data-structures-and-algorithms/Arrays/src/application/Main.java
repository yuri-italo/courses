package application;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Array numbers = new Array(3);
        numbers.insert(10);
        numbers.insert(20);
        numbers.insert(30);
        numbers.insert(40);
        numbers.insert(50);
        numbers.insert(60);
        numbers.insertAt(100,2);
        numbers.insertAt(100,5);
        numbers.print();
    }
}
