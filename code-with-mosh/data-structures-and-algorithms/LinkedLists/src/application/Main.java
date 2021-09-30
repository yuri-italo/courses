package application;

public class Main {
    public static void main(String[] args) {
        var list = new LinkedList();
        System.out.println(list.size());
        list.addFirst(10);
        System.out.println(list.size());
        list.addLast(20);
        list.addLast(30);
        System.out.println(list.size());
        list.removeLast();
        list.removeFirst();
        System.out.println(list.size());
    }
}
