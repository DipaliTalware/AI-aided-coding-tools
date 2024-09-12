package org.example;

public class ReverseString {
    public static String reverseString(String input) {

        char[] characters = input.toCharArray();


        int left = 0;
        int right = characters.length - 1;


        while (left < right) {
            // Swap characters
            char temp = characters[left];
            characters[left] = characters[right];
            characters[right] = temp;

            // Move pointers
            left++;
            right--;
        }


        return new String(characters);
    }

}
