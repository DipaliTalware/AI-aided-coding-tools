package org.example;

public class PalindromeChecker {


    public static boolean isPalindrome(String input) {
        input = input.toLowerCase();

        int left = 0;
        int right = input.length() - 1;

        while (left < right) {
            if (!Character.isLetterOrDigit(input.charAt(left))) {
                left++;
            } else if (!Character.isLetterOrDigit(input.charAt(right))) {
                right--;
            } else {
                if (input.charAt(left) != input.charAt(right)) {
                    return false; // Not a palindrome
                }
                left++;
                right--;
            }
        }
        return true;
    }
}
