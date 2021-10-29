import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] array = {7,1,3,5,3};
        System.out.println(Arrays.toString(array));
        var sorter = new BucketSort();
        sorter.sort(array, 3);
        System.out.println("Sorted: " + Arrays.toString(array));
    }
}