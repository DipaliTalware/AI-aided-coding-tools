package org.example;

public class BubbleSort {
    /**
     * Sorts an array using the Bubble Sort algorithm.
     *
     * @param array the array to be sorted
     */

    public static void sortArray(int[] array) {
        int length = array.length; // Length of the array
        boolean swapped; // Flag to check if any elements were swapped

        // Repeat until no more swaps are needed
        do {
            swapped = false;

            // Compare adjacent elements and swap if needed
            for (int i = 1; i < length; i++) {
                if (array[i - 1] > array[i]) {
                    swapElements(array, i - 1, i);
                    swapped = true; // Set flag to true as a swap occurred
                }
            }
            length--; // Decrease length to ignore the last sorted elements
        } while (swapped);
    }

    /**
     * Swaps two elements in an array.
     *
     * @param array the array containing the elements
     * @param firstIndex the index of the first element
     * @param secondIndex the index of the second element
     */
    private static void swapElements(int[] array, int firstIndex, int secondIndex) {
        int temp = array[firstIndex]; // Temporary variable for swapping
        array[firstIndex] = array[secondIndex];
        array[secondIndex] = temp;
    }
}
