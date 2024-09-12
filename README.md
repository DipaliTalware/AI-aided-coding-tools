# BubbleSortExample

## Overview

`BubbleSortExample` demonstrates the implementation of the Bubble Sort algorithm in Java. It includes a `main` method to test the sorting functionality and uses descriptive method names and comments to explain the code.

## Features

- **Sorting**: Uses the Bubble Sort algorithm to sort an array of integers.
- **Array Printing**: Prints the array before and after sorting to show the changes.

## Methods

### `main(String[] args)`

- Initializes an array of integers.
- Prints the original array.
- Sorts the array using the `sortArray` method.
- Prints the sorted array.

### `sortArray(int[] array)`

- Sorts the provided array using Bubble Sort.
- Repeatedly compares adjacent elements and swaps them if necessary.
- Continues until no swaps are needed.

### `swapElements(int[] array, int firstIndex, int secondIndex)`

- Swaps elements at the specified indices in the array.

## Usage

1. Compile the `BubbleSortExample` class.
2. Run the `main` method to see the array sorting in action.

## Example

```java
public static void main(String[] args) {
    int[] numbers = {5, 2, 9, 1, 5, 6};
    sortArray(numbers);
    System.out.println(Arrays.toString(numbers)); // Output: [1, 2, 5, 5, 6, 9]
}
