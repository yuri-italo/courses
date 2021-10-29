import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] array = {10,3,8,7,1,5,4,9,2,6};
        System.out.println(Arrays.toString(array));
        var sorter = new BubbleSort();
        sorter.sort(array);
        System.out.println("Sorted: " + Arrays.toString(array));
    }
}
