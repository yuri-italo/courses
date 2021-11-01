public class Search {
    public int linearSearch(int[] array, int target) {
        for (int i = 0; i < array.length; i++)
            if (target == array[i])
                return i;
        return -1;
    }

    public int binarySearchRec(int[] array, int target) {
        return binarySearchRec(array,target,0, array.length - 1);
    }

    private int binarySearchRec(int[] array, int target, int left, int right) {
        if (right < left)
            return -1;

        int middle = (left + right) / 2;

        if (array[middle] == target)
            return middle;

        if (target < array[middle])
            return binarySearchRec(array,target,left,middle - 1);

        return binarySearchRec(array,target,middle + 1, right);
    }
}
