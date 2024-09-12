package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BubbleSortTest {

    @Test
    public void test_SortArrayWithUnsortedArray() {
        int[] unsorted = {5, 2, 9, 1, 5, 6};
        int[] expected = {1, 2, 5, 5, 6, 9};
        BubbleSort.sortArray(unsorted);
        assertArrayEquals(expected, unsorted);
    }

    @Test
    public void test_SortArrayWithAlreadySortedArray() {
        int[] sorted = {1, 2, 3, 4, 5};
        int[] expected = {1, 2, 3, 4, 5};
        BubbleSort.sortArray(sorted);
        assertArrayEquals(expected, sorted);
    }

    @Test
    public void test_SortArrayWithSingleElement() {
        int[] singleElement = {42};
        int[] expected = {42};
        BubbleSort.sortArray(singleElement);
        assertArrayEquals(expected, singleElement);
    }

    @Test
    public void test_SortArrayWithEmptyArray() {
        int[] empty = {};
        int[] expected = {};
        BubbleSort.sortArray(empty);
        assertArrayEquals(expected, empty);
    }

    @Test
    public void test_SortArrayWithNegativeNumbers() {
        int[] withNegatives = {-3, -1, -7, 2, 0};
        int[] expected = {-7, -3, -1, 0, 2};
        BubbleSort.sortArray(withNegatives);
        assertArrayEquals(expected, withNegatives);
    }
}
