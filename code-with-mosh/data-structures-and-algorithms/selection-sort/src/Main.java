import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] array = {8,3,1,7,10,5,4,9,2,6};
        System.out.println(Arrays.toString(array));
        var sorter = new SelectionSort();
        sorter.sort(array);
        System.out.println("Sorted: " + Arrays.toString(array));
    }
}