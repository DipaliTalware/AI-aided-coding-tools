package org.example;


//Create a method that reverses a given string (e.g., "Hello" -> "olleH").
//Implement a function that checks if a given string is a palindrome (e.g., "anna" is a palindrome).
//Use AI-aided-coding to write a method that generates the first n prime numbers.

import java.util.List;

import static org.example.PalindromeChecker.isPalindrome;
import static org.example.PrimeGenerator.generatePrimes;
import static org.example.ReverseString.reverseString;

public class Main {
    public static void main(String[] args) {
        String result = reverseString("ABCDEFGHIJK");
        System.out.println("The reversed String is:" + result);

        String testString = "Anna";
        if (isPalindrome(testString)) {
            System.out.println(testString + " is a palindrome.");
        } else {
            System.out.println(testString + " is not a palindrome.");
        }

        int n = 10;
        List<Integer> primes = generatePrimes(n);


        System.out.println("First " + n + " prime numbers: " + primes);
    }

}

