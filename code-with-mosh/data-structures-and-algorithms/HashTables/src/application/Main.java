package application;

public class Main {
    public static void main(String[] args) {
        CharFinder finder = new CharFinder();
        var ch = finder.findFirstRepeatedChar("green apple");
        System.out.println(ch);
    }
}
