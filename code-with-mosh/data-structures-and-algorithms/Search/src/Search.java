public class Search {
    public int linearSearch(int[] array, int target) {
        for (int i = 0; i < array.length; i++)
            if (target == array[i])
                return i;
        return -1;
    }
}
