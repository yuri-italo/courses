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
        var numbers2 = new Array(3);
        numbers2.insert(10);
        numbers2.insert(30);
        numbers2.insert(70);
        var numbers3 = (numbers.intersect(numbers2));
        numbers3.print();
    }
}
