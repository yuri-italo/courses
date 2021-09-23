package application;

public class Array {
    private int[] items;
    private int count;

    public Array(int length) {
        items = new int[length];
    }

    public void print() {
        for (int i = 0; i < count; i++)
            System.out.println(items[i]);
    }

    public void insert(int item) {
        // If the array is full, resize it
        if (items.length == count) {
            // Create a new array (twice the size)
            int[] aux = new int[count * 2];

            // Copy all the existing items
            for (int i = 0; i < items.length; i++)
                aux[i] = items[i];

            // Set "items to this new array"
            items = aux;
        }

        // Add the new item at the end
        items[count++] = item;
    }

    public void removeAt(int arrayIndex) {
        // Validate the index
        if (arrayIndex < 0 || arrayIndex >= count)
            throw new IllegalArgumentException();

        // Shift the items to the left to fill the hole
        for (int i = arrayIndex; i < count; i++)
            items[i] = items[i +1];

        count--;
    }
}
