package src;

public class Main {
    /**
     * Merge sort algo.
     */
    private static void mergeSort(int[] array) {
        // base case
        if (array.length <= 1) {
            return;
        }

        int mid = array.length / 2;
        int[] leftArray = new int[mid];
        int[] rightArray = new int[array.length - mid];

        // fill leftArray
        for (int i = 0; i < mid; i++) {
            leftArray[i] = array[i];
        }

        // fill rightArray
        for (int i = mid; i < array.length; i++) {
            rightArray[i - mid] = array[i];
        }

        // Recursively sort left and right halves
        mergeSort(leftArray);
        mergeSort(rightArray);

        // merge the sorted halves
        merge(leftArray, rightArray, array);
    }

    private static void merge(int[] leftArray, int[] rightArray, int[] array) {
        int leftLength = leftArray.length;
        int rightLength = rightArray.length;
        int i = 0, j = 0, k = 0;

        // merge leftArray and rightArray into array
        while (i < leftLength && j < rightLength) {
            if (leftArray[i] <= rightArray[j]) {
                array[k++] = leftArray[i++];
            } else {
                array[k++] = rightArray[j++];
            }
        }

        // copy remaining elements of leftArray
        while (i < leftLength) {
            array[k++] = leftArray[i++];
        }

        // copy remaining elements of rightArray
        while (j < rightLength) {
            array[k++] = rightArray[j++];
        }
    }

    /**
     * Prints an array.
     */
    private static void printArray(int[] array) {
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] array = { 12, 11, 13, 5, 6, 7 };

        System.out.println("original array:");
        printArray(array);

        mergeSort(array);

        System.out.println("sorted array:");
        printArray(array);
    }
}
